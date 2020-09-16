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
public enum HardwareType {
	COMPUTER("Computer"),SERVER("Server"),MOBILE("mobile");

	private String type;

	HardwareType(String type) {
		this.setType(type);
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
