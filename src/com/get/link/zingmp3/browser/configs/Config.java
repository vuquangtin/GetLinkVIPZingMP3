package com.get.link.zingmp3.browser.configs;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 * 
 * lớp đọc file config nếu tồn tại và được cấu hình. nếu không sẽ dùng config
 * mặc định.
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:01677443333
 *
 */
public class Config implements Iterable<Map.Entry<String, String>> {
	static Logger logger = Logger.getLogger(Config.class.getName());
	private HashMap<String, String> updatingResource = new HashMap<String, String>();

	private Set<String> finalParameters = new HashSet<String>();
	private String configFolder = "conf";
	static final String UNKNOWN_RESOURCE = "Unknown";
	private ClassLoader classLoader;
	{
		classLoader = Thread.currentThread().getContextClassLoader();
		if (classLoader == null) {
			classLoader = Config.class.getClassLoader();
		}
	}

	public Config(String name) {
		loadResource(name);
	}

	public Config(ArrayList<String> resources) {
		loadResources(resources);
	}

	private void loadResources(ArrayList<String> resources) {
		for (Object resource : resources) {
			loadResource(resource);
		}

	}

	private void loadResource(Object name) {
		try {
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			// ignore all comments inside the xml file
			docBuilderFactory.setIgnoringComments(true);

			// allow includes in the xml file
			docBuilderFactory.setNamespaceAware(true);
			try {
				docBuilderFactory.setXIncludeAware(true);
			} catch (UnsupportedOperationException e) {
				if (logger.isDebugEnabled())
					logger.debug("Failed to set setXIncludeAware(true) for parser " + docBuilderFactory + ":" + e);
			}
			DocumentBuilder builder = docBuilderFactory.newDocumentBuilder();
			Document doc = null;
			Element root = null;
			if (name instanceof String) {

				File file = new File(configFolder + "/" + name.toString());
				if (file.exists()) {
					InputStream in = new BufferedInputStream(new FileInputStream(file));
					try {
						doc = builder.parse(in);
					} finally {
						in.close();
					}
				}
			} else if (name instanceof Element) {
				root = (Element) name;
			}

			if (doc == null && root == null) {
				throw new RuntimeException(name + " not found");
			}

			if (root == null) {
				root = doc.getDocumentElement();
			}
			if (!"configuration".equals(root.getTagName()))
				if (logger.isDebugEnabled())
					logger.debug("bad conf file: top-level element not <configuration>");
			NodeList props = root.getChildNodes();
			for (int i = 0; i < props.getLength(); i++) {
				Node propNode = props.item(i);
				if (!(propNode instanceof Element))
					continue;
				Element prop = (Element) propNode;
				if ("configuration".equals(prop.getTagName())) {
					loadResource(prop);
					continue;
				}
				if (!"property".equals(prop.getTagName()))
					if (logger.isDebugEnabled())
						logger.debug("bad conf file: element not <property>");
				NodeList fields = prop.getChildNodes();
				String attr = null;
				String value = null;
				boolean finalParameter = false;
				for (int j = 0; j < fields.getLength(); j++) {
					Node fieldNode = fields.item(j);
					if (!(fieldNode instanceof Element))
						continue;
					Element field = (Element) fieldNode;
					if ("name".equals(field.getTagName()) && field.hasChildNodes())
						attr = ((Text) field.getFirstChild()).getData().trim();
					if ("value".equals(field.getTagName()) && field.hasChildNodes())
						value = ((Text) field.getFirstChild()).getData();
				}
				if (attr != null) {
					if (value != null) {
						if (!finalParameters.contains(attr)) {
							updatingResource.put(attr, value);
						} else {
							if (logger.isDebugEnabled())
								logger.debug(name + ":a attempt to override final parameter: " + attr + ";  Ignoring.");
						}
					}
					if (finalParameter) {
						finalParameters.add(attr);
					}
				}
			}

		} catch (IOException e) {
			if (logger.isDebugEnabled())
				logger.debug("error parsing conf file: " + e);
			throw new RuntimeException(e);
		} catch (DOMException e) {
			if (logger.isDebugEnabled())
				logger.debug("error parsing conf file: " + e);
			throw new RuntimeException(e);
		} catch (SAXException e) {
			if (logger.isDebugEnabled())
				logger.debug("error parsing conf file: " + e);
			throw new RuntimeException(e);
		} catch (ParserConfigurationException e) {
			if (logger.isDebugEnabled())
				logger.debug("error parsing conf file: " + e);
			throw new RuntimeException(e);
		}
	}

	@Override
	public Iterator<Entry<String, String>> iterator() {
		// TODO Auto-generated method stub
		return updatingResource.entrySet().iterator();
	}

	public int getInt(String name, int defaultValue) {
		String valueString = getTrimmed(name);
		if (valueString == null)
			return defaultValue;
		try {
			String hexString = getHexDigits(valueString);
			if (hexString != null) {
				return Integer.parseInt(hexString, 16);
			}
			return Integer.parseInt(valueString);
		} catch (NumberFormatException e) {
			return defaultValue;
		}
	}

	public String getTrimmed(String name) {
		String value = get(name);
		if (null == value) {
			return null;
		} else {
			return value.trim();
		}
	}

	private String getHexDigits(String value) {
		boolean negative = false;
		String str = value;
		String hexString = null;
		if (value.startsWith("-")) {
			negative = true;
			str = value.substring(1);
		}
		if (str.startsWith("0x") || str.startsWith("0X")) {
			hexString = str.substring(2);
			if (negative) {
				hexString = "-" + hexString;
			}
			return hexString;
		}
		return null;
	}

	public String get(String name) {
		if (updatingResource.containsKey(name))
			return updatingResource.get(name);
		return null;
	}

	public String get(String name, String defaultValue) {
		String value = get(name);
		if (value == null)
			return defaultValue;
		else
			return value;
	}

	public long getLong(String name, long defaultValue) {
		String valueString = getTrimmed(name);
		if (valueString == null)
			return defaultValue;
		try {
			String hexString = getHexDigits(valueString);
			if (hexString != null) {
				return Long.parseLong(hexString, 16);
			}
			return Long.parseLong(valueString);
		} catch (NumberFormatException e) {
			return defaultValue;
		}
	}

	public float getFloat(String name, float defaultValue) {
		String valueString = getTrimmed(name);
		if (valueString == null)
			return defaultValue;
		try {
			return Float.parseFloat(valueString);
		} catch (NumberFormatException e) {
			return defaultValue;
		}
	}

	public boolean getBoolean(String name, boolean defaultValue) {
		String valueString = getTrimmed(name);
		if ("true".equals(valueString))
			return true;
		else if ("false".equals(valueString))
			return false;
		else
			return defaultValue;
	}

	public Pattern getPattern(String name, Pattern defaultValue) {
		String valString = get(name);
		if (null == valString || "".equals(valString)) {
			return defaultValue;
		}
		try {
			return Pattern.compile(valString);
		} catch (PatternSyntaxException pse) {
			if (logger.isDebugEnabled())
				logger.debug(
						"Regular expression '" + valString + "' for property '" + name + "' not valid. Using default");
			return defaultValue;
		}
	}

	/**
	 * Return value matching this enumerated type.
	 * 
	 * @param name
	 *            Property name
	 * @param defaultValue
	 *            Value returned if no mapping exists
	 * @throws IllegalArgumentException
	 *             If mapping is illegal for the type provided
	 */
	public <T extends Enum<T>> T getEnum(String name, T defaultValue) {
		final String val = get(name);
		return null == val ? defaultValue : Enum.valueOf(defaultValue.getDeclaringClass(), val);
	}

	/**
	 * Parse the given attribute as a set of integer ranges
	 * 
	 * @param name
	 *            the attribute name
	 * @param defaultValue
	 *            the default value if it is not set
	 * @return a new set of ranges from the configured value
	 */
	public IntegerRanges getRange(String name, String defaultValue) {
		return new IntegerRanges(get(name, defaultValue));
	}

	/**
	 * A class that represents a set of positive integer ranges. It parses strings
	 * of the form: "2-3,5,7-" where ranges are separated by comma and the
	 * lower/upper bounds are separated by dash. Either the lower or upper bound may
	 * be omitted meaning all values up to or over. So the string above means 2, 3,
	 * 5, and 7, 8, 9, ...
	 */
	public static class IntegerRanges {
		private static class Range {
			int start;
			int end;
		}

		List<Range> ranges = new ArrayList<Range>();

		public IntegerRanges() {
		}

		public IntegerRanges(String newValue) {
			StringTokenizer itr = new StringTokenizer(newValue, ",");
			while (itr.hasMoreTokens()) {
				String rng = itr.nextToken().trim();
				String[] parts = rng.split("-", 3);
				if (parts.length < 1 || parts.length > 2) {
					throw new IllegalArgumentException("integer range badly formed: " + rng);
				}
				Range r = new Range();
				r.start = convertToInt(parts[0], 0);
				if (parts.length == 2) {
					r.end = convertToInt(parts[1], Integer.MAX_VALUE);
				} else {
					r.end = r.start;
				}
				if (r.start > r.end) {
					throw new IllegalArgumentException("IntegerRange from " + r.start + " to " + r.end + " is invalid");
				}
				ranges.add(r);
			}
		}

		/**
		 * Convert a string to an int treating empty strings as the default value.
		 * 
		 * @param value
		 *            the string value
		 * @param defaultValue
		 *            the value for if the string is empty
		 * @return the desired integer
		 */
		private static int convertToInt(String value, int defaultValue) {
			String trim = value.trim();
			if (trim.length() == 0) {
				return defaultValue;
			}
			return Integer.parseInt(trim);
		}

		/**
		 * Is the given value in the set of ranges
		 * 
		 * @param value
		 *            the value to check
		 * @return is the value in the ranges?
		 */
		public boolean isIncluded(int value) {
			for (Range r : ranges) {
				if (r.start <= value && value <= r.end) {
					return true;
				}
			}
			return false;
		}

		@Override
		public String toString() {
			StringBuffer result = new StringBuffer();
			boolean first = true;
			for (Range r : ranges) {
				if (first) {
					first = false;
				} else {
					result.append(',');
				}
				result.append(r.start);
				result.append('-');
				result.append(r.end);
			}
			return result.toString();
		}
	}
}
