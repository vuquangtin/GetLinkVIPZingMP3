package ccom.get.link.zingmp3.models;

public class LineInfor {
	private String url;
	private String folder;

	public LineInfor(String line) {
		String[] lines = line.split("\\t");
		if (lines.length == 2) {
			setUrl(lines[0]);
			setFolder(lines[1]);
		}
	}

	public LineInfor(String url, String folder) {
		this.url = url;
		this.folder = folder;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

}
