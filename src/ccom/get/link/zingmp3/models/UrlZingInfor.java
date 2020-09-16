package ccom.get.link.zingmp3.models;

public class UrlZingInfor {
	private String id;
	private String url;
	private String name;

	public UrlZingInfor(String url) {
		this.url = url;
		processId();
		processName();
	}

	private void processName() {
		name = processUrl(4);
	}

	private void processId() {
		id = processUrl(5);
		if (id != null)
			id = id.replace(".html", "");
	}

	public static void main(String[] args) {
		String url = "https://zingmp3.vn/bai-hat/Chi-Con-Nhung-Mua-Nho-Acoustic-Version-Bao-Tram/ZW68A996.html";
		System.out.println(new UrlZingInfor(url).getName());
		System.out.println(new UrlZingInfor(url).getId());
	}

	private String processUrl(int index) {
		if (url != null) {
			String[] parts = url.split("/");
			if (parts.length > index)
				return parts[index];
		}
		return null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id + "\t" + name + "\t" + url;
	}
}
