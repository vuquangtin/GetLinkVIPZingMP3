package com.get.link.zingmp3.main;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import ccom.get.link.zingmp3.finals.ZingMp3;
import ccom.get.link.zingmp3.starts.StartZingMp3;

import com.get.link.zingmp3.browser.configs.ConfigSingleton;
import com.get.link.zingmp3.browser.useragent.UserAgentEnum;
import com.get.link.zingmp3.utilities.Log4jUtils;
import com.get.link.zingmp3.utilities.Minds;
import com.get.link.zingmp3.utilities.OsCheck;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/GetLinkVIPZingMP3">https://github.com/vuquangtin/GetLinkVIPZingMP3</a>
 *
 */
public class GetLinkVIPZingMP3 {
	static Logger logger = Logger.getLogger(GetLinkVIPZingMP3.class.getName());
	public static final int MILLISECONDS_TO_MINUTES = 60000;
	public static final int MILLISECONDS_TO_SECONDS = 1000;
	public static String saveSession = "zingmp3";;

	/*-
	 * java -jar GetLinkVIPZingMP3-0.0.1-SNAPSHOT-jar-with-dependencies.jar conf/zing_album_nhac_xuan.txt

	 */
	public static void main(String[] args) {
		logger = Log4jUtils.initLog4j();
		boolean seleniumActive = ConfigSingleton.getInstance()
				.getSeleniumActive(true);
		String sessionName = "zing_mp3";
		logger.info("seleniumActive:" + seleniumActive);
		String fileAlbum = "";
		if (args.length == 1) {
			fileAlbum = args[0];
		} else {
			logger.info("can phai co link album");
			System.exit(1);
		}
		if (seleniumActive) {
			// sessionName = ConfigSingleton.getInstance().getSessionFolder();
			logger.info("sessionName:" + sessionName);
			// "100026796833604_gmail4_VuThiPhuong";
			// String accessToken = "100011097882370_TEST_USERAGENT";
			boolean enableSaveSession = true;

			UserAgentEnum userAgent = ConfigSingleton.getInstance()
					.getUserAgentEnum(UserAgentEnum.MAC_Yandex_Browser_171);
			logger.info("userAgent:" + userAgent);
			// isNewSession = false;
			// http://timfb.xyz/menu/get-session-for-app.html
			// AppIdType appIdType = AppIdType.FACEBOOK_FOR_IPHONE;
			// ChromedriverHandler.chromeDriverHandlerThread().start();
			GetLinkVIPZingMP3 browser = new GetLinkVIPZingMP3(sessionName,
					enableSaveSession, userAgent);
			browser.start(fileAlbum);
			// ChromedriverHandler.chromeDriverHandlerThread().stop();
			if (logger.isDebugEnabled())
				logger.debug("sleep:100m");
			sleep(100);
		} else {
			// sessionName = ConfigSingleton.getInstance().getSessionFolder();
			logger.debug("session:" + sessionName);
			String sessionPath = ConfigSingleton.getInstance().getSessionPath();
			logger.debug("sessionPath:" + sessionPath);
			logger.debug("run:" + ZingMp3.HOME_PAGE);
			String[] cmdarray = null;
			// https://winaero.com/blog/run-google-chrome-with-different-profiles/
			// check chrome chrome://version/
			String chromeBinPath;
			switch (OsCheck.getOperatingSystemType()) {
			case Linux:
				/**
				 * And for Linux:
				 * 
				 * google-chrome --profile-directory=Default
				 */
				// --start-maximized --no-first-run --no-default-browser-check
				chromeBinPath = ConfigSingleton.getInstance().get(
						"googlechrome.bin.path", "/opt/google/chrome/chrome");
				cmdarray = new String[] {
						"bash",
						"-c",
						chromeBinPath + " --user-data-dir=" + sessionPath
								+ " --profile-directory=" + sessionName + " "
								+ Minds.HOME_PAGE };

				break;
			case MacOS:
				// https://stackoverflow.com/questions/34193343/how-to-load-and-launch-a-google-chrome-app-from-the-command-line
				// open -a "Google Chrome" --args --profile-directory=Default
				chromeBinPath = ConfigSingleton
						.getInstance()
						.get("googlechrome.bin.path",
								"/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
				cmdarray = new String[] {
						"/usr/bin/open",
						"-a",
						chromeBinPath + " --args --user-data-dir="
								+ sessionPath + " --profile-directory="
								+ sessionName + " " + Minds.HOME_PAGE };
				// Runtime.getRuntime().exec(new String[]{"/usr/bin/open", "-a",
				// "/Applications/Google Chrome.app",
				// "http://yourwebsite.com/"});
				break;
			case Other:
				break;
			case Solaris:
				break;
			case Windows:
				break;
			default:
				break;

			}
			if (cmdarray != null) {
				for (String cmdarrayItem : cmdarray) {
					logger.debug("cmdarrayItem:" + cmdarrayItem);
				}
				try {
					Runtime.getRuntime().exec(cmdarray);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public GetLinkVIPZingMP3(String fbSession, boolean isSaved,
			UserAgentEnum userAgent) {
		if (fbSession != null) {
			startBrowser(fbSession, isSaved, userAgent);
		}

	}

	public boolean start(String album) {
		StartZingMp3 zingMp3 = new StartZingMp3(driver, album, "nhac_mp3");
		return zingMp3.start();
	}

	WebDriver driver;

	public void initWebDriver() {
		// initWebDriver(true, null, UserAgentEnum.SAFARI_MACOS_10_6_8);
		initWebDriver(true, null, null);
	}

	public void initWebDriver(boolean isSaveSessionBrowser,
			UserAgentEnum userAgent) {
		initWebDriver(isSaveSessionBrowser, null, userAgent);
	}

	public void initWebDriver(boolean isSaveSessionBrowser,
			String sessionFolder, UserAgentEnum userAgent) {
		if (driver == null) {
			ConfigSingleton.getInstance().setChromeDriverProperty();
			ConfigSingleton.getInstance().setChromeLogs();
			// System.setProperty("webdriver.chrome.logfile",
			// "/home/tin/eclipse-workspace/FBGrapher/FBGrapher/crawl_data/logs/chromedriver.log");
			ChromeOptions options = new ChromeOptions();
			Map<String, Object> chromePreferences = new HashMap<String, Object>();
			chromePreferences.put(
					"profile.default_content_setting_values.notifications", 2);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			if (logger.isDebugEnabled())
				logger.debug(capabilities);
			// chromePreferences.put("profile.default_content_settings.popups",
			// 0);
			String downloadDirectory = ConfigSingleton.getInstance()
					.getChromeDownloadDirectory();
			if (downloadDirectory != null) {
				chromePreferences.put("download.default_directory",
						downloadDirectory);
				if (logger.isDebugEnabled())
					logger.debug("download.default_directory:"
							+ downloadDirectory);
			} else {
				if (logger.isDebugEnabled())
					logger.debug("download.default_directory:null");
			}
			// options.addArguments("--headless", "--disable-gpu",
			// "--window-size=1920,1200", "--ignore-certificate-errors");
			options.addArguments("--disable-gpu"); // applicable to windows os
													// only
			options.addArguments("--disable-dev-shm-usage"); // overcome limited
																// resource
																// problems
			options.addArguments("--no-sandbox"); // Bypass OS security model
			// options.addExtensions(new File("*Block-image_v1.0.crx"));
			// options.addArguments("ignore-certificate-errors");
			// DesiredCapabilities capabilities = DesiredCapabilities.chrome();

			options.addArguments("--user-agent="
					+ "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.61 Safari/537.36");

			// options.addArguments("--user-agent="
			// + "Mozilla/5.0 (Macintosh; U; Intel MacOS X 10_6_7; ja-jp)
			// AppleWebKit/533.20.25 (KHTML, like Gecko)
			// Version/5.0.4Safari/533.20.27");

			// options.addArguments("--user-agent="
			// + "Mozilla/5.0 (Macintosh; U; PPC Mac OS X 10_4_11; tr)
			// AppleWebKit/528.4+
			// (KHTML, like Gecko) Version/4.0dp1 Safari/526.11.2" );
			// options.addArguments("--no-sandbox");
			// String userAgent = "Mozilla/5.0 (iPad; CPU OS 9_3_2 like Mac OS
			// X)
			// AppleWebKit/600.1.4 (KHTML, like Gecko) 1Password/6.4.2 (like
			// Version/9.3.2
			// Mobile/13F69 Safari/600.1.4)";//
			// RandomUserAgent.getRandomUserAgent();
			// userAgent = UserAgentEnum.SAFARI_MACOS.getUserAgent();
			// logger.debug("--user-agent=" + userAgent);
			// options.addArguments("--user-agent=" + userAgent);
			// options.addArguments("--privileged");
			// options.addArguments("--disable-setuid-sandbox");
			if (isSaveSessionBrowser) {
				options.addArguments("user-data-dir="
						+ ConfigSingleton.getInstance().getSessionPath()
						+ sessionFolder);
				logger.debug("user-data-dir="
						+ ConfigSingleton.getInstance().getSessionPath()
						+ sessionFolder);
			}
			// capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			// ChromeDriverService src = new ChromeDriverService.Builder()
			// .usingDriverExecutable(new
			// File(ConfigSingleton.getInstance().getChromeSeleniumDriverPath()))
			// .usingAnyFreePort().build();
			// try {
			// src.start();
			// } catch (IOException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// if (logger.isDebugEnabled())
			// logger.debug("start driver");
			// try {
			// // src,
			// // options.addArguments("disable-infobars");
			// // options.merge(capabilities);
			// options.setExperimentalOption("prefs", chromePreferences);
			// capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,
			// true);
			// capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			// Map<String, String> environment = new HashMap<String, String>();
			// environment.put("DISPLAY", ":1.5");// 1.5
			// // environment.put("-Dwindow.hide", "false");
			// ChromeDriverService chromeDriverService = new
			// ChromeDriverService.Builder()
			// .usingDriverExecutable(new
			// File(ConfigSingleton.getInstance().getChromeSeleniumDriverPath()))
			// .usingAnyFreePort().withEnvironment(ImmutableMap.of("DISPLAY",
			// ":1")).build();
			// // .withEnvironment(ImmutableMap.of("DISPLAY", ":1"))
			// // String[] listCapability =
			// // { "--start-maximized",
			// // "--disable-extensions", "--disable-translate" };
			// // ----------incognito
			// capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,
			// true);
			// capabilities.setCapability("chrome.switches",
			// Arrays.asList("--start-maximized", "--disable-extensions",
			// "--disable-translate", "--incognito"));
			// // capabilities.setCapability("chrome.switches",
			// // listCapability);
			//
			// try {
			// chromeDriverService.start();
			// } catch (IOException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// listDrivers.add(new ChromeDriver(chromeDriverService,
			// capabilities));// options);

			// driver = new ChromeDriver(capabilities);
			// options.addArguments("--no-sandbox");
			// options.addArguments("--disable-setuid-sandbox");
			try {
				driver = new ChromeDriver(options);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// driver = new ChromeDriver(src, options);
			// RemoteWebDriver driver = new RemoteWebDriver(
			// new URL("http://localhost:4444/wd/hub"),
			// new ChromeOptions());
			// ChromeOptions options = new ChromeOptions();
			// options.addArguments("disable-infobars");
			// options.merge(capabilities);
			if (logger.isDebugEnabled())
				logger.debug("end driver");
			if (driver != null) {
				// driver.manage().timeouts().implicitlyWait(10,
				// TimeUnit.SECONDS);
				driver.manage().timeouts()
						.implicitlyWait(12000, TimeUnit.SECONDS);
				driver.manage().window().maximize();

				if (!isSaveSessionBrowser)
					driver.manage().deleteAllCookies();
			}
			// } catch (org.openqa.selenium.WebDriverException e) {
			// e.printStackTrace();
			// } catch (Exception e) {
			// e.printStackTrace();
			// }

		}
	}

	public boolean startBrowser(String folderSession, boolean isSaved,
			UserAgentEnum userAgent) {
		// if (fbSession.matches("[0-9]*") || fbSession.matches("[0-9]*_.*")) {

		if (driver == null) {
			if (isSaved) {
				if (logger.isDebugEnabled())
					logger.debug("isSaveSessionBrowser:" + isSaved);
				try {
					initWebDriver(isSaved, folderSession, userAgent);
					// driver =
					// ChromeDriverHelper.getInstance(profileId).getChromeDriver();
					// driver.manage().timeouts().implicitlyWait(30,
					// TimeUnit.SECONDS);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				if (logger.isDebugEnabled())
					logger.debug("isSaveSessionBrowser:" + isSaved);
				initWebDriver(isSaved, folderSession, userAgent);
				// ConfigSingleton.getInstance().setChromeDriverProperty();
				// driver = new ChromeDriver();
				// driver.manage().window().maximize();
				// driver.manage().deleteAllCookies();
				// driver.manage().timeouts().implicitlyWait(30,
				// TimeUnit.SECONDS);
			}
		}
		initWebDriver();
		// }
		return false;
	}

	public static void sleep(int minutes) {
		sleep(minutes, "", "");
	}

	public static void sleep(int minutes, String message, String getMessage) {
		try {
			if (logger.isDebugEnabled())
				logger.debug(message + ":" + "(pleep " + minutes
						+ "p)\nMessage:" + getMessage);
			Thread.sleep(minutes * MILLISECONDS_TO_MINUTES);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void pause(String pauseMessage) {
		try {
			int minutes = 30;
			if (logger.isDebugEnabled())
				logger.debug(pauseMessage + ":" + "(pleep " + minutes + "m)");
			Thread.sleep(minutes * MILLISECONDS_TO_MINUTES);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void sleepSeconds(int seconds, String message) {
		try {
			if (logger.isDebugEnabled())
				logger.debug(message + ":" + "(pleep " + seconds + " seconds)");
			Thread.sleep(seconds * MILLISECONDS_TO_SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
