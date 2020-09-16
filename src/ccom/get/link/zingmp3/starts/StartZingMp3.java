package ccom.get.link.zingmp3.starts;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ccom.get.link.zingmp3.finals.ZingMp3;
import ccom.get.link.zingmp3.models.LineInfor;
import ccom.get.link.zingmp3.models.TrackInfo;

import com.get.link.zingmp3.utilities.FileUtils;

public class StartZingMp3 {
	static Logger logger = Logger.getLogger(StartZingMp3.class.getName());
	protected WebDriver driver;
	protected String pathSaved;
	private String pathListAlbum;
	// https://zing-mp3.glitch.me/?url=https://zingmp3.vn/embed/song/ZWA8UZF9
	final static String TOOL_DOWNLOAD = "https://zing-mp3.glitch.me/?url=https://zingmp3.vn/embed/song/";

	// https://zing-mp3.glitch.me/?url=https://zingmp3.vn/embed/song/ZW68A996
	public StartZingMp3(WebDriver driver, String pathListAlbum, String pathSaved) {
		this.driver = driver;
		this.pathListAlbum = pathListAlbum;
		this.pathSaved = pathSaved;
	}

	public boolean start() {
		try {
			if (logger.isDebugEnabled())
				logger.debug("StartZingMp3 start");

			List<LineInfor> listAlbum = FileUtils
					.getListLineInfor(pathListAlbum);

			if (listAlbum != null) {
				int totalLink = listAlbum.size();

				if (totalLink > 0) {
					int index = 0;
					while (true) {
						if (driver != null) {
							LineInfor urlAlbum = listAlbum.get(index);
							if (logger.isDebugEnabled())
								logger.debug("get Album:" + urlAlbum.getUrl());
							driver.get(urlAlbum.getUrl());
							// logger.debug(driver.getPageSource());
							processAlbum(urlAlbum);
							index++;
							if (index >= totalLink) {
								break;
							}

						}
					}
				}
			}

			try {
				driver.close();
				driver.quit();
				System.exit(1);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	private void processAlbum(LineInfor urlAlbum) {
		List<TrackInfo> listTrack = getTrack(urlAlbum.getUrl());
		if (listTrack != null) {
			listTrack.forEach(item -> {
				logger.debug(item);
			});
			downloadTrack(listTrack, urlAlbum.getFolder());
		}

	}

	private void downloadTrack(List<TrackInfo> listTrack, String subFolder) {
		for (TrackInfo trackInfo : listTrack) {
			downloadTrack(trackInfo, subFolder);
		}

	}

	private void downloadTrack(TrackInfo trackInfo, String subFolder) {

		String urlFetchDownload = TOOL_DOWNLOAD
				+ trackInfo.getUrlZing().getId();
		URL url;

		try {
			url = new URL(urlFetchDownload);
			JSONTokener tokener = new JSONTokener(url.openStream());
			JSONObject obj = new JSONObject(tokener);
			logger.debug(obj.toString());

			// JSONObject obj = new JSONObject(doc);
			JSONObject objSource = obj.getJSONObject("source");
			String urlDownload = null;
			if (objSource != null) {
				JSONObject objAudio = objSource.getJSONObject("audio");
				if (objAudio != null) {
					JSONObject obj320 = objAudio.getJSONObject("320");
					if (obj320 != null) {
						urlDownload = obj320.getString("download");
					} else {
						JSONObject obj128 = objAudio.getJSONObject("128");
						if (obj128 != null) {
							urlDownload = obj128.getString("download");
						}
					}
				}
			}
			if (urlDownload != null) {
				try {
					String filename = trackInfo.getUrlZing().getName();
					File file;
					String folder = null;
					if (filename.endsWith(".mp3")) {
						if (subFolder != null) {
							folder = pathSaved + "/" + subFolder;
							file = new File(folder + "/" + filename);

						} else {
							folder = pathSaved;
							file = new File(pathSaved + "/" + filename);
						}
					} else {
						if (subFolder != null) {
							folder = pathSaved + "/" + subFolder;
							file = new File(folder + "/" + filename + ".mp3");
						} else {
							folder = pathSaved;
							file = new File(pathSaved + "/" + filename + ".mp3");
						}
					}
					if (new File(folder).exists() == false) {
						try {
							new File(folder).mkdir();
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					}
					if (!file.exists()) {
						downloadMP3(file, urlDownload);
					} else {
						logger.debug(file + " exists");
					}
				} catch (MalformedURLException e) {

					e.printStackTrace();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	private void downloadMP3(File file, String mP3Link)
			throws MalformedURLException, IOException {
		logger.debug(mP3Link);
		URLConnection conn = new URL(mP3Link).openConnection();
		InputStream is = conn.getInputStream();

		OutputStream outstream = new FileOutputStream(file);

		byte[] buffer = new byte[4096];
		int len;
		while ((len = is.read(buffer)) > 0) {
			outstream.write(buffer, 0, len);
		}
		outstream.close();
	}

	private List<TrackInfo> getTrack(String urlAlbum) {
		String pageSource = driver.getPageSource();
		// Creating a pattern object
		Pattern pattern = Pattern
				.compile("<script type=\"application/ld+json\">(.*)</script>");
		// Matching the compiled pattern in the String
		Matcher matcher = pattern.matcher(pageSource);
		if (matcher.find()) {
			String result = matcher.group(1);
			// System.out.println("result:" + result);
		}
		final By SCRIPT = By.tagName("script");

		List<WebElement> scripts = new WebDriverWait(driver, 5)
				.until(ExpectedConditions
						.presenceOfAllElementsLocatedBy(SCRIPT));
		List<TrackInfo> list = null;
		if (scripts != null && scripts.size() > 0) {
			for (WebElement webElement : scripts) {
				String jsonString = webElement.getAttribute("innerHTML");
				// logger.debug(jsonString);
				if (jsonString.contains(urlAlbum)) {
					JSONObject obj = new JSONObject(jsonString);
					JSONArray arrListElement = obj.getJSONObject("track")
							.getJSONArray("itemListElement");
					list = new ArrayList<TrackInfo>();
					for (int i = 0; i < arrListElement.length(); i++) {
						String url = arrListElement.getJSONObject(i).getString(
								"url");
						String name = arrListElement.getJSONObject(i)
								.getJSONObject("item").getString("name");
						TrackInfo item = new TrackInfo(url, name);
						list.add(item);
					}
					break;
				}

			}
		}
		return list;

	}
}
