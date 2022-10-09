package com.ecom.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.ecom.drivermanager.DriverFactory;
import com.ecom.helper.FileReaderManager;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@Before(order = 0)
	public void initializeBrowser() {
		new DriverFactory().launchDriver();
	}
	
	@Before(order = 1)
	public void launchApplication() {
		DriverFactory.getdriver().get(FileReaderManager.getInstanceFrm().getInstanceCR().geturl());
	}
	
	@After(order = 1)
	public void closeBrowser() {
		DriverFactory.getdriver().close();
	}
	
	@After(order = 0)
	public void quitBrowser() {
		DriverFactory.getdriver().quit();
	}
	
	@AfterStep
	public void attachScreenshot(Scenario scenario) {
		if(scenario.isFailed()) {
		byte[] screenshot = ((TakesScreenshot)DriverFactory.getdriver()).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot,"image/png",null);
		}
	}
	
	

	
	
	
}
