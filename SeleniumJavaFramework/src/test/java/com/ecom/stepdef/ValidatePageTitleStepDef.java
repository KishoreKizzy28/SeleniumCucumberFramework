package com.ecom.stepdef;

import com.ecom.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidatePageTitleStepDef {
	
	PageObjectManager pom = new PageObjectManager();
	
	@Given("User on Home Page")
	public void user_on_home_page() {  
	    pom.getInstanceHp().verifyHomePage();
	}

	@When("Click Mobile link")
	public void click_mobile_link() {
	      pom.getInstanceHp().navigateToMobilePage();
	}

	@Then("Validate Mobile Page Title")
	public void validate_mobile_page_title() {
	     pom.getInstanceMp().verifyMobilePageTitle();
	}

	@When("Click TV link")
	public void click_tv_link() {
		pom.getInstanceHp().navigateToTvPage();
	}

	@Then("Validate TV Page Title")
	public void validate_tv_page_title() {
	       pom.getInstanceTp().verifyTvPageTitle();
	}

}
