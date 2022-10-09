package com.ecom.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties p;
	
	public ConfigurationReader() {
		File f = new File("./src/test/resources/config.properties");
		FileInputStream fis;
		try {
			fis = new FileInputStream(f);
			 p = new Properties();     
				p.load(fis); 
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		 
	}
	
	public  String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
}
