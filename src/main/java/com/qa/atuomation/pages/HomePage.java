package com.qa.atuomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.automation.testbase.TestBase;

public class HomePage extends TestBase {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Object repository
	@FindBy(xpath = "//div[@class=\"header_user_info\"]")
	WebElement Sign_in_link;

	// methods OR Actions
	public void SignInClick() {
		Sign_in_link.click();
	}

}
