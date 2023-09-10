package com.inetBankingV1.utilityLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	// create object of Properties file
	Properties prop;
	String path = System.getProperty("user.dir") + "/src/main/java/com/inetBankingV1/configLayer/config.properties";
	// String path =
	// "C:\\Users\\nites\\eclipse-workspace\\HybridFramework\\src\\main\\java\\com\\configLayer\\CogmentoConfig.properties";

	// create constructor
	public ReadConfig() {

		// create object of properties
		prop = new Properties();
		try {
			// use FileInputStraem class for read properties file
			FileInputStream fis = new FileInputStream(path);

			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

	public String getUrl() {
		String url = prop.getProperty("url");
		if (url != null) {
			return url;

		} else {
			throw new RuntimeException("URl not found in config file");
		}
	}

	public String getUsername() {
		String username = prop.getProperty("username");
		if (username != null) {
			return username;
		} else {
			throw new RuntimeException("username not found in config file");
		}
	}

	public String getPassword() {
		String password = prop.getProperty("password");
		if (password != null) {
			return password;
		} else {
			throw new RuntimeException("password not found in config file");
		}
	}
}
