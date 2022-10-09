package com.ecom.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ecom.drivermanager.DriverFactory;

public class SeleniumBase {
	
	
	
	public SeleniumBase() {
		
		PageFactory.initElements(DriverFactory.getdriver(), this);
	}
	
	
	public void verifyText(WebElement ele, String expectedText) {
        try {
            String actual = ele.getText().trim();
            if (actual.equalsIgnoreCase(expectedText)) {
                Assert.assertTrue(true, actual + " text is Matched with Expected");
            } else {
                Assert.fail(actual + " text is not Matched with Expected");
            }
        } catch (Exception e) {
            Assert.fail("Unable to verify Text : " + e.getMessage());
        }
    }

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			Assert.assertTrue(true, "Data is entered successfully");
		} catch (Exception e) {
			Assert.fail("Unable to enter Data : " + e.getMessage());
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
		} catch (Exception e) {
			Assert.fail("Unable to click on element : " + e.getMessage());
		}
	}

}
