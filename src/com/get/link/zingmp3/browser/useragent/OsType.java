package com.get.link.zingmp3.browser.useragent;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:01677443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/designpattern">https://github.com/vuquangtin/designpattern</a>
 *
 */
public enum OsType {
	WINDOWS("Windows"),LINUX("Linux"), MACOSX("Mac OS X"), IPAD("IPAD"), IOS("IOS"), MOBILE("mobile"),Browser_In_App_Browser("Browser - In-App Browser");

	private String name;

	OsType(String name) {
		this.setName(name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
