package ccom.get.link.zingmp3.models;

import org.apache.log4j.Logger;

public class TrackInfo {
	static Logger logger = Logger.getLogger(TrackInfo.class.getName());
	private UrlZingInfor urlZing;
	private String name;

	public TrackInfo(String url, String name) {
		urlZing = new UrlZingInfor(url);
		this.name = name;
	}

	public UrlZingInfor getUrlZing() {
		return urlZing;
	}

	public void setUrlZing(UrlZingInfor urlZing) {
		this.urlZing = urlZing;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {

		return "TrackInfo[name:" + name + "\n-->\tUrlZingInfor:" + urlZing + "]";
	}

}
