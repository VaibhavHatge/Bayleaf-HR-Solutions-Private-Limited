package com.qa.atuomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.automation.testbase.TestBase;

public class LoginPage extends TestBase {

	public static String emailid;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Object Repository
	@FindBy(xpath = "//input[@id='email_create']")
	WebElement email_create_TextField;

	@FindBy(xpath = "//button[@id='SubmitCreate']")
	WebElement create_account_btn;

	@FindBy(xpath = "//input[@id='email']")
	WebElement email_TextField;

	@FindBy(xpath = "//input[@id='passwd']")
	WebElement password_TextField;

	@FindBy(xpath = "//button[@id='SubmitLogin']")
	WebElement sign_in_btn;

	// Create Account
	public void createAccount() {

		emailid = prop.getProperty("Email");
		emailid = emailid + String.valueOf((int) (Math.random() * 90) + 10) + "@gmail.com";
		System.out.println(emailid);
		email_create_TextField.sendKeys(emailid);
		create_account_btn.click();
	}

	// Login with email id and password
	public void signIn() {
		email_TextField.sendKeys(emailid);
		password_TextField.sendKeys("ABC@123");
		sign_in_btn.click();
	}
}
