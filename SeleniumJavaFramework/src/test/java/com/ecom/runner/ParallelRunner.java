package com.ecom.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
                 glue = {"com.ecom.hooks","com.ecom.stepdef"},
                 plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 monochrome = true,tags="@validation")

public class ParallelRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
