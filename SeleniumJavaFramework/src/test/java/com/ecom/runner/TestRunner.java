package com.ecom.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
                 glue = {"com.ecom.hooks","com.ecom.stepdef"},
                plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
                 monochrome = true,tags="@validation")

public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}
