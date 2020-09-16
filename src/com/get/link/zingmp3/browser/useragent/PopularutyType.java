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
public enum PopularutyType {
	VERY_COMMON("Very common"),
	UNCOMMON("Uncommon"), AVERAGE("Average");
	private String name;

	PopularutyType(String name) {
		this.setName(name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
