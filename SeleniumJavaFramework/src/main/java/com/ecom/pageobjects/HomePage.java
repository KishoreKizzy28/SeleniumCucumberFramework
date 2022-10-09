package com.ecom.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ecom.base.SeleniumBase;

public class HomePage extends SeleniumBase {
	
	@FindBy(xpath = "//div[@class='page-title']/child::h2")
	private WebElement homePageTitle;
	
	@FindBy(xpath = "//a[text()='Mobile']")
	private WebElement Mobile;
	
	@FindBy(xpath = "//a[text()='TV']")
	private WebElement tv;

	public HomePage() {
		super();
	}

	public void verifyHomePage() {
		verifyText(homePageTitle,"This is demo site for");
	}
	
	public void navigateToMobilePage() {
		click(Mobile);
	}
	
	public void navigateToTvPage() {
		click(tv);
	}
	

}
