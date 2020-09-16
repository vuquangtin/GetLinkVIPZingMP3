package ccom.get.link.zingmp3.models;

public class ChromeCommandInfo {
	private String command;
	private String description;
	private String value = "";

	public ChromeCommandInfo(String command, String description) {

	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
