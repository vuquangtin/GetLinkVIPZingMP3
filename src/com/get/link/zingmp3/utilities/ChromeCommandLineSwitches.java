package com.get.link.zingmp3.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeOptions;

import ccom.get.link.zingmp3.models.ChromeCommandInfo;

public class ChromeCommandLineSwitches {
	public static final String CHROME_PATH="/home/vuquangtin/workspace/crawl_data/drivers/chromedriver/linux64/chromedriver";
	public static List<ChromeCommandInfo> getChromeCommandLines() {
		List<ChromeCommandInfo> list = new ArrayList<ChromeCommandInfo>();
		// list.add(new ChromeCommandInfo("command, description"));
		list.add(new ChromeCommandInfo("--ash-force-desktop",
				"	Forces uses of the desktop version of Chrome"));
		list.add(new ChromeCommandInfo("--disable-3d-apis",
				"	Disables 3D Apis, including WebGL and Pepper 3D		"));
		list.add(new ChromeCommandInfo("--disable-accelerated-video",
				"	Disables GPU accelerated video		"));
		list.add(new ChromeCommandInfo("--disable-background-mode",
				"	Background apps won't continue to run when Chrome exits.	"));
		list.add(new ChromeCommandInfo("--disable-gpu",
				"	Disables hardware acceleration using the GPU			"));
		list.add(new ChromeCommandInfo("--disable-plugins",
				"	Prevents all plugins from running	"));
		list.add(new ChromeCommandInfo("--disable-plugins-discovery",
				"	Disables the discovery of missing plugins	"));
		list.add(new ChromeCommandInfo("--disable-preconnect",
				"	Disables speculative TCP/IP preconnections		"));
		list.add(new ChromeCommandInfo("--disable-translate",
				"	Disables the Google Translate feature		"));
		list.add(new ChromeCommandInfo("--dns-prefetch-disable",
				"	Disable DNS prefetching			"));
		list.add(new ChromeCommandInfo("--enable-kiosk-mode",
				"	Kiosk Mode for Chrome OS			"));
		list.add(new ChromeCommandInfo("--incognito",
				"	Launches Chrome directly in Incognito private browsing mode	"));
		list.add(new ChromeCommandInfo("--media-cache-size",
				"	Disk space used by media cache in bytes			"));
		list.add(new ChromeCommandInfo("--multi-profiles",
				"	Enable multiple profiles in Chrome			"));
		list.add(new ChromeCommandInfo("--new-profile-management",
				"	Enable the new profile management in Chrome		"));
		list.add(new ChromeCommandInfo("--no-experiments",
				"	Run Chrome without experiments set in chrome://flags	"));
		list.add(new ChromeCommandInfo("--no-pings",
				"	No hyperlink auditing pings			"));
		list.add(new ChromeCommandInfo("--no-referrers",
				"	Use Chrome without sending referrers		"));
		list.add(new ChromeCommandInfo("--purge-memory-button",
				"	Add purge memory button to Chrome			"));
		list.add(new ChromeCommandInfo("--reset-variation-state",
				"	Change the field trials that the browser is currently signed up for		"));
		list.add(new ChromeCommandInfo("--restore-last-session",
				"	Restore the last session on run			"));
		list.add(new ChromeCommandInfo("--ssl-version-min",
				"	Specify the minimum SSL version accepted		"));
		list.add(new ChromeCommandInfo("--start-maximized",
				"	Starts the Chrome window maximized.			"));
		list.add(new ChromeCommandInfo("--window-position",
				"	Specify the initial window position using --window-position=x,y		"));
		list.add(new ChromeCommandInfo("--window-size",
				"	Specify the initial window size using --window-position=x,y			"));
		return list;
	}

	private List<String> addChromeArguments() {
		List<String> chromeArguments = new ArrayList<>();
		chromeArguments.add("--test-type");
		chromeArguments.add("--browser-test");
		chromeArguments.add("--disable-popup-blocking");
		chromeArguments.add("--disable-extensions");
		chromeArguments.add("--disable-infobars");
		chromeArguments.add("--disable-notifications");
		chromeArguments.add("--no-default-browser-check");
		chromeArguments.add("--allow-file-access");
		chromeArguments.add("--allow-file-access-from-files");
		chromeArguments.add("--allow-nacl-file-handle-api[2]");
		chromeArguments.add("--use-file-for-fake-audio-capture");
		chromeArguments.add("--allow-external-pages");
		chromeArguments.add("--enable-local-file-accesses");
		chromeArguments.add("--allow-external-pages");
		chromeArguments.add("--ash-enable-touch-view-testing");
		chromeArguments.add("--enable-touch-drag-drop");
		chromeArguments.add("--enable-touchview[7]");
		chromeArguments.add("--disable-extensions-file-access-check");
		return chromeArguments;
	}

	private ChromeOptions setChromeOptions() {
		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "Pixel 2");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("mobileEmulation", mobileEmulation);
		options.addArguments(addChromeArguments());
		options.setAcceptInsecureCerts(true);
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		return options;
	}
}
