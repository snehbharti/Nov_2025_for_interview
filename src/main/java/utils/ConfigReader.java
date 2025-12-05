package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties properties;

	// Constructor to initialize properties file
	public ConfigReader(String environment) {
		properties = new Properties();
		String configFilePath = "src/main/resources/config/" + environment + ".properties";

		try {
			FileInputStream fis = new FileInputStream(configFilePath);
			properties.load(fis);
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Get value by key from the properties file
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
}
