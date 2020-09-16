package com.get.link.zingmp3.browser.configs;

import java.io.File;
import java.nio.file.Paths;
import java.util.Random;

import org.apache.log4j.Logger;

import com.get.link.zingmp3.browser.enums.OSArchitectureType;
import com.get.link.zingmp3.browser.enums.OSType;
import com.get.link.zingmp3.browser.enums.SleepType;
import com.get.link.zingmp3.browser.enums.StartType;
import com.get.link.zingmp3.browser.useragent.UserAgentEnum;
import com.get.link.zingmp3.utilities.OsCheck;
import com.get.link.zingmp3.utilities.SymbolsKeyboard;
import com.get.link.zingmp3.utilities.TimeUtils;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:01677443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/designpattern">https://github.com/vuquangtin/designpattern</a>
 *
 */
public class ConfigSingleton {
	public static final String EXCEPTION_MESSAGE = "exception:";
	static Logger logger = Logger.getLogger(ConfigSingleton.class.getName());
	private static volatile ConfigSingleton instance = null;
	private Config conf = null;
	private static String DOWNLOAD_DIRECTORY = null;
	private static OSType OSTYPE = null;
	private static OSArchitectureType OSARCHTYPE = null;

	private ConfigSingleton() {
		try {
			conf = new Config("conf-site.xml");
		} catch (Exception ex) {
			// if (IPUtils.isLocalHost())
			// ex.printStackTrace();
			logger.error("Exception:" + ex);

		}
		try {
			if (OSTYPE == null)
				OSTYPE = OsCheck.getOperatingSystemType();
			if (OSARCHTYPE == null)
				OSARCHTYPE = OsCheck.getOSArchitectureType();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ConfigSingleton getInstance() {
		if (instance == null) {
			synchronized (ConfigSingleton.class) {
				if (instance == null) {
					instance = new ConfigSingleton();
				}
			}
		}
		return instance;
	}

	public static final String SESSION_FOLDER_PATH = "sessions";
	public static final String SESSION_FOLDER_NAME = "profiles";
	public static final String DEFAULT_DOWNLOAD = "download";
	// private static final String CHROME_LOGS_MAC = WORKSPACE_MAC
	// + "crawl_data/logs/chromedriver.log";
	// private static final String CHROME_LOGS_LINUX = WORKSPACE_LINUX
	// + "crawl_data/logs/chromedriver.log";
	private static final String COOKIES_FOLDER_SAVED_LINUX = "src/com/org/fbgrapher/resources/cookies/";
	private static final String COOKIES_FOLDER_SAVED_MAC = "src/com/org/fbgrapher/resources/cookies/";

	public static final String DEFAULT_LOGS_WIN = "logs\\chromedriver.log";
	public static final String DEFAULT_LOGS_LINUX = "logs/chromedriver.log";

	public String getSessionFolder2() {
		String rand = SESSION_FOLDER_NAME + "_" + new Random().nextInt(10);
		String session = rand;
		if (conf != null)
			session = conf.get("path.folder.session.name", rand);
		if (logger.isDebugEnabled()) {
			logger.debug("session:" + session);
		}
		return session;
	}

	public UserAgentEnum getUserAgentEnum(UserAgentEnum defaultValue) {
		String agent = UserAgentEnum.Firefox.toString();
		if (conf != null)
			agent = conf.get("browser.useragent", "Firefox");
		for (UserAgentEnum item : UserAgentEnum.values()) {
			if (item.equals(agent))
				return item;
		}
		return defaultValue;
	}

	public StartType getStartType() {
		String startType = conf.get("app.start.type", "facebook");
		for (StartType entry : StartType.values()) {
			if (entry.getKey().equals(startType.toLowerCase())) {
				return entry;
			}
		}
		return StartType.FACEBOOK;
	}

	public boolean getSeleniumActive(boolean defaultValue) {
		boolean active = conf.getBoolean("selenium.active", defaultValue);
		return active;
	}

	public String getGooglechromeBinPath(String defaultValue) {
		return conf.get("googlechrome.bin.path", defaultValue);
	}

	public String getChromeSeleniumDriverPath() {
		if (OSTYPE == OSType.Linux)
			return getChromedriver();
		else
			return getChromedriver();
	}

	public static String CHROME_DRIVER = null;

	public String getChromedriver() {
		if (CHROME_DRIVER == null) {
			CHROME_DRIVER = removeEscape(conf.get("selenium.chrome.driverpath",
					"chromedriver"));
		}
		return CHROME_DRIVER;
	}

	public void setChromeDriverProperty() {
		if (OSTYPE == OSType.MacOS) {
			if (logger.isDebugEnabled()) {
				logger.debug("Driver:" + getChromedriver());
			}
			// File chrome = new File(CHROME_DRIVER_MAC);
			// System.setProperty("webdriver.gecko.driver",
			// chrome.getAbsolutePath());
			System.setProperty("webdriver.chrome.driver", getChromedriver());
		} else if (OSTYPE == OSType.Linux) {
			if (logger.isDebugEnabled()) {
				logger.debug("Driver:" + getChromedriver());
			}
			// File chrome = new File(CHROME_DRIVER_LINUX);
			// System.setProperty("webdriver.gecko.driver",
			// chrome.getAbsolutePath());
			System.setProperty("webdriver.chrome.driver", getChromedriver());
		} else {
			if (logger.isDebugEnabled()) {
				logger.debug("Driver:" + getChromedriver());
			}
			// File chrome = new File(CHROME_DRIVER_LINUX);
			// System.setProperty("webdriver.gecko.driver",
			// chrome.getAbsolutePath());
			System.setProperty("webdriver.chrome.driver", getChromedriver());
		}
	}

	public String getSessionPath() {
		String path = SESSION_FOLDER_PATH;
		if (conf != null)
			path = removeEscape(conf.get("path.folder.session.path",
					SESSION_FOLDER_PATH));
		if (logger.isDebugEnabled()) {
			logger.debug("path:" + path);
		}
		if (OSTYPE != OSType.Windows) {
			if (path.contains(SymbolsKeyboard.SLASH_WINDOWS_KEY)) {
				path.replaceAll(SymbolsKeyboard.SLASH_WINDOWS_KEY,
						SymbolsKeyboard.SLASH_UNIX_KEY);
			}
			if (!path.endsWith(SymbolsKeyboard.SLASH_UNIX_KEY))
				return path + SymbolsKeyboard.SLASH_UNIX_KEY;
			return path;
		} else {
			if (path.contains(SymbolsKeyboard.SLASH_UNIX_KEY)) {
				path.replaceAll(SymbolsKeyboard.SLASH_UNIX_KEY,
						SymbolsKeyboard.SLASH_WINDOWS_KEY);

			}
			if (!path.endsWith(SymbolsKeyboard.SLASH_WINDOWS_KEY))
				return path + SymbolsKeyboard.SLASH_WINDOWS_KEY;
			return path;
		}

	}

	public String getSessionPath(String session) {
		if (session != null) {
			return getSessionPath() + session;
		} else {
			return getSessionPath();
		}

	}

	public int getSleep() {
		return conf.getInt("app.sleep.value", 100);
	}

	public SleepType getSleepType() {
		int type = conf.getInt("app.sleep.type", 100);
		for (SleepType item : SleepType.values()) {
			if (item.getKey() == type)
				return item;
		}
		return SleepType.MIMUTE;
	}

	public String getCookiesFolder() {
		if (logger.isDebugEnabled()) {
			logger.debug("OSTYPE:" + OSTYPE);
		}
		if (OSTYPE == OSType.Linux)
			return COOKIES_FOLDER_SAVED_LINUX;
		else
			return COOKIES_FOLDER_SAVED_MAC;
	}

	public String getChromeDownloadDirectory() {
		if (OSTYPE == OSType.Linux)
			return DEFAULT_DOWNLOAD;
		else
			return DEFAULT_DOWNLOAD;
	}

	public void setChromeLogs() {

		if (OSTYPE == OSType.Windows)
			System.setProperty("webdriver.chrome.logfile", removeEscape(conf
					.get("selenium.chrome.log", DEFAULT_LOGS_WIN)));
		else if (OSTYPE == OSType.Linux)
			System.setProperty("webdriver.chrome.logfile", removeEscape(conf
					.get("selenium.chrome.log", DEFAULT_LOGS_LINUX)));
		else
			System.setProperty("webdriver.chrome.logfile", removeEscape(conf
					.get("selenium.chrome.log", DEFAULT_LOGS_LINUX)));

	}

	public OSType getOSType() {
		return OSTYPE;
	}

	public OSArchitectureType getOSArchitectureType() {
		return OSARCHTYPE;
	}

	public Config getConfig() {
		return conf;
	}

	public String getSeleniumDriverPath() {
		String chromeDriverName = "chromedriver";
		String seleniumDriverPathConfig = conf.get("webdriver.chrome.driver",
				chromeDriverName);
		String folderChromeDriver = "chromedriver";
		String seleniumDriverPath = null;
		try {
			if (!seleniumDriverPathConfig.equals(chromeDriverName)
					&& (seleniumDriverPathConfig.contains("/") || seleniumDriverPathConfig
							.contains("\\"))) {
				if (new File(seleniumDriverPathConfig).exists()) {
					seleniumDriverPath = seleniumDriverPathConfig;
				}
			}

			if (seleniumDriverPath == null) {
				seleniumDriverPathConfig = Paths.get(".").toAbsolutePath()
						.normalize().toString();
				switch (OSTYPE) {
				// ubuntu
				case Linux:
					switch (OSARCHTYPE) {
					case X64:
						seleniumDriverPath = seleniumDriverPathConfig
								+ "/drivers/" + folderChromeDriver
								+ "/linux64/" + chromeDriverName;
						break;
					case X32:
						seleniumDriverPath = seleniumDriverPathConfig
								+ "/drivers/" + folderChromeDriver
								+ "/linux32/" + chromeDriverName;
						break;
					}
					break;
				case MacOS:
					switch (OSARCHTYPE) {
					case X64:
						seleniumDriverPath = seleniumDriverPathConfig
								+ "/drivers/" + folderChromeDriver + "/mac64/"
								+ chromeDriverName;
						break;
					case X32:
						seleniumDriverPath = seleniumDriverPathConfig
								+ "/drivers/" + folderChromeDriver + "/mac32/"
								+ chromeDriverName;
						break;
					}
					break;
				case Windows:
					switch (OSARCHTYPE) {
					case X64:
						// win32
						seleniumDriverPath = seleniumDriverPathConfig
								+ "\\drivers\\" + folderChromeDriver
								+ "\\win64\\" + chromeDriverName + ".exe";
						break;
					case X32:
						seleniumDriverPath = seleniumDriverPathConfig
								+ "\\drivers\\" + folderChromeDriver
								+ "\\win32\\" + chromeDriverName + ".exe";
						break;
					}
					break;
				case Other:
					break;
				default:
					break;
				}
			}
			if (seleniumDriverPath != null) {
				if (!new File(seleniumDriverPath).exists()) {
					return null;
				} else {
					if (logger.isDebugEnabled()) {
						logger.debug("run seleniumDriverPath of chromeDriver:"
								+ seleniumDriverPath);
					}
					TimeUtils.sleepInSeconds(5,
							"run seleniumDriverPath of chromeDriver:"
									+ seleniumDriverPath);
					return seleniumDriverPath;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(EXCEPTION_MESSAGE + ex);

		}
		return null;
	}

	public String getProfilePath() {
		String profileFolder = "profile";
		String profilePathConfig = conf.get(
				"org.openqa.selenium.driver.userdatadir", profileFolder);
		String profilePath = null;
		try {
			if (!profilePathConfig.equals(profileFolder)
					&& (profilePathConfig.contains("/") || profilePathConfig
							.contains("\\"))) {
				if (new File(profilePathConfig).exists()) {
					profilePath = profilePathConfig;
				}
			}

			if (profilePath == null) {
				profilePathConfig = Paths.get(".").toAbsolutePath().normalize()
						.toString();
				switch (OSTYPE) {
				// ubuntu
				case Linux:
					switch (OSARCHTYPE) {
					case X64:
						profilePath = profilePathConfig + "/" + profileFolder;
						break;
					case X32:
						profilePath = profilePathConfig + "/" + profileFolder;
						break;
					}
					break;
				case MacOS:
					switch (OSARCHTYPE) {
					case X64:
						profilePath = profilePathConfig + "/" + profileFolder;
						break;
					case X32:
						profilePath = profilePathConfig + "/" + profileFolder;
						break;
					}
					break;
				case Windows:
					switch (OSARCHTYPE) {
					case X64:
						// win32
						profilePath = profilePathConfig + "\\" + profileFolder;
						break;
					case X32:
						profilePath = profilePathConfig + "\\" + profileFolder;
						break;
					}
					break;
				case Other:
					break;
				default:
					break;
				}
			}
			if (profilePath != null) {
				if (!new File(profilePath).exists()) {
					return null;
				} else {
					if (logger.isDebugEnabled()) {
						logger.debug("save profilePath :" + profilePath);
					}
					TimeUtils.sleepInSeconds(5, "save profilePath :"
							+ profilePath);
					return profilePath;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(EXCEPTION_MESSAGE + ex);
		}
		return null;
	}

	public String getDownloadDirectory() {
		return getDownloadDirectory(false);
	}

	public String getDownloadDirectory(boolean isSlashEnd) {

		if (DOWNLOAD_DIRECTORY == null) {
			String defaultDirectory = "download_video";
			String downloadDirectoryConfig = conf.get(
					"webdriver.chrome.download_directory", defaultDirectory);
			String downloadDirectory = null;
			try {
				if (!downloadDirectoryConfig.equals(defaultDirectory)
						&& (downloadDirectoryConfig.contains("/") || downloadDirectoryConfig
								.contains("\\"))) {
					if (new File(downloadDirectoryConfig).exists()) {
						downloadDirectory = downloadDirectoryConfig;
					}
				}

				if (downloadDirectory == null) {
					downloadDirectoryConfig = Paths.get(".").toAbsolutePath()
							.normalize().toString();
					switch (OSTYPE) {
					// ubuntu
					case Linux:
						switch (OSARCHTYPE) {
						case X64:
							downloadDirectory = downloadDirectoryConfig + "/"
									+ defaultDirectory;

							// SymbolsKeyboard.SymbolsKeyboard.SLASH_EMPTY_KEY =
							// SymbolsKeyboard.SymbolsKeyboard.SLASH_UNIX_KEY;
							break;
						case X32:
							downloadDirectory = downloadDirectoryConfig + "/"
									+ defaultDirectory;

							// SymbolsKeyboard.SymbolsKeyboard.SLASH_EMPTY_KEY =
							// SymbolsKeyboard.SymbolsKeyboard.SLASH_UNIX_KEY;
							break;
						}
						break;
					case MacOS:
						switch (OSARCHTYPE) {
						case X64:
							downloadDirectory = downloadDirectoryConfig + "/"
									+ defaultDirectory;

							// SymbolsKeyboard.SymbolsKeyboard.SLASH_EMPTY_KEY =
							// SymbolsKeyboard.SymbolsKeyboard.SLASH_UNIX_KEY;
							break;
						case X32:
							downloadDirectory = downloadDirectoryConfig + "/"
									+ defaultDirectory;

							// SymbolsKeyboard.SymbolsKeyboard.SLASH_EMPTY_KEY =
							// SymbolsKeyboard.SymbolsKeyboard.SLASH_UNIX_KEY;
							break;
						}
						break;
					case Windows:
						switch (OSARCHTYPE) {
						case X64:
							// win32
							downloadDirectory = downloadDirectoryConfig + "\\"
									+ defaultDirectory;

							// SymbolsKeyboard.SymbolsKeyboard.SLASH_EMPTY_KEY =
							// SymbolsKeyboard.SymbolsKeyboard.SLASH_WINDOWS_KEY;
							break;
						case X32:
							// downloadDirectory = downloadDirectoryConfig +
							// "\\" + defaultDirectory;

							SymbolsKeyboard.SLASH_EMPTY_KEY = SymbolsKeyboard.SLASH_WINDOWS_KEY;
							break;
						}
						break;
					case Other:
						break;
					default:
						break;
					}
				}
				if (downloadDirectory != null) {
					if (!new File(downloadDirectory).exists()) {
						return null;
					} else {
						DOWNLOAD_DIRECTORY = downloadDirectory;
						if (DOWNLOAD_DIRECTORY.contains("/")) {
							SymbolsKeyboard.SLASH_EMPTY_KEY = SymbolsKeyboard.SLASH_UNIX_KEY;
						} else {
							SymbolsKeyboard.SLASH_EMPTY_KEY = SymbolsKeyboard.SLASH_WINDOWS_KEY;
						}
						if (isSlashEnd)
							return DOWNLOAD_DIRECTORY
									+ SymbolsKeyboard.SLASH_EMPTY_KEY;
						else
							return DOWNLOAD_DIRECTORY;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(EXCEPTION_MESSAGE + e);
			}
			return null;
		} else {
			if (isSlashEnd)
				return DOWNLOAD_DIRECTORY + SymbolsKeyboard.SLASH_EMPTY_KEY;
			else
				return DOWNLOAD_DIRECTORY;
		}
	}

	public boolean getBoolean(String key, boolean defaultValue) {
		if (conf != null)
			return conf.getBoolean(key, defaultValue);
		else
			return defaultValue;

	}

	public String get(String key, String defaultValue) {
		if (conf != null)
			return conf.get(key, defaultValue);
		else
			return defaultValue;
	}

	public int getInt(String key, int defaultValue) {
		if (conf != null)
			return conf.getInt(key, defaultValue);
		else
			return defaultValue;

	}

	public long getLong(String key, int defaultValue) {
		if (conf != null)
			return conf.getLong(key, defaultValue);
		else
			return defaultValue;

	}

	public String getHomePage(String defaultValue) {
		return get("app.start.homepage", defaultValue);
	}

	private String removeEscape(String str) {
		return str.replaceAll("\n", "").replaceAll("\t", "");
	}
}
