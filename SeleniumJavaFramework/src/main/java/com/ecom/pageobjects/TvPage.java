package com.ecom.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ecom.base.SeleniumBase;

public class TvPage extends SeleniumBase {
	
	@FindBy(xpath = "//h1[text()='TV']")
	private WebElement tvTitle;
	
	
	public TvPage() {
		super();
	}
	
	public void verifyTvPageTitle() {
		verifyText(tvTitle,"TV");
	}

}
