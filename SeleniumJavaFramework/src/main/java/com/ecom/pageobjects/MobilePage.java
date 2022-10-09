package com.ecom.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ecom.base.SeleniumBase;

public class MobilePage extends SeleniumBase {
	
	@FindBy(xpath = "//h1[text()='Mobile']")
	private WebElement mobileTitle;

	public MobilePage() {
		super();
	}
	
	public void verifyMobilePageTitle() {
		verifyText(mobileTitle,"Mobile");
	}
	
	



}
