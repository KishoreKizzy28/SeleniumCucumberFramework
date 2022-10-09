package com.ecom.drivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.ecom.helper.FileReaderManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public WebDriver launchDriver()  {
		String browserType = FileReaderManager.getInstanceFrm().getInstanceCR().getbrowser();
		System.out.println("Thread id : "+ Thread.currentThread().getId());
		if (browserType.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
		}
		else if (browserType.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver.set(new EdgeDriver());	
		}
		getdriver().manage().window().maximize();
		
	return getdriver();
	

		
	}
	
	public static WebDriver getdriver() {
		return driver.get();
	}

}
