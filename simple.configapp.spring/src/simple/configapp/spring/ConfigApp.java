package simple.configapp.spring;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

public class ConfigApp {

	protected final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	String title;

	public void setTitle(String title) {
		this.title = title;
		LOGGER.debug("Updated (title=" + title + ")");
	}

	public void refresh() {
		LOGGER.debug("Configuration updated (title=" + title + ")");
	}
}
