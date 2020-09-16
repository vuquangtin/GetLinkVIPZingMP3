package com.get.link.zingmp3.browser.configs;

import org.apache.log4j.Logger;

public class YoutubeSingleton {
	static Logger logger = Logger.getLogger(YoutubeSingleton.class.getName());
	private static volatile YoutubeSingleton instance = null;

	public static YoutubeSingleton getInstance() {
		if (instance == null) {
			synchronized (ConfigSingleton.class) {
				if (instance == null) {
					instance = new YoutubeSingleton();
				}
			}
		}
		return instance;
	}

	public int getLoop() {
		return ConfigSingleton.getInstance().getInt(
				"session.type.youtube.loop", 1);
	}

	public boolean getRandom() {
		return ConfigSingleton.getInstance().getBoolean(
				"session.type.youtube.random", true);
	}
	public String getFileListURL(String defaultValue) {
		String listURL=ConfigSingleton.getInstance().get(
				"app.start.youtube.listurl", defaultValue);
		logger.debug("listURL:"+listURL);
		return listURL;
	}
}
