package simple.configapp;

public class ConfigApp {
	String title;

	public void setTitle(String title) {
		this.title = title;
	}

	public void refresh() {
		System.out.println("Configuration updated (title=" + title + ")");
	}
}
