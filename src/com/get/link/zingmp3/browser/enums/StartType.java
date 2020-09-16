package com.get.link.zingmp3.browser.enums;

import org.apache.log4j.Logger;

public enum StartType {
	FACEBOOK("facebook"), YOUTUBE("youtube"), SESSION("session"), PLAYLIST(
			"playlist"), LOTUS("lotus");

	private String key;

	static Logger logger = Logger.getLogger(StartType.class.getName());

	StartType(String key) {
		this.key = key;
	}

	public String getKey() {
		if (logger.isDebugEnabled()) {
			logger.debug(this.key + ":" + this.key);
		}
		return this.key;
	}
}
