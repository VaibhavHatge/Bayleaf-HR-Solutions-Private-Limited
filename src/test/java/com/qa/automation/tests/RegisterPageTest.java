package com.qa.automation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.atuomation.pages.HomePage;
import com.qa.atuomation.pages.LoginPage;
import com.qa.atuomation.pages.RegisterPage;
import com.qa.automation.testbase.TestBase;

public class RegisterPageTest extends TestBase {

	HomePage homepage;
	LoginPage loginpage;
	RegisterPage registerpage;

	public RegisterPageTest() {
		// It will initialize property file from TestBase class constructor
		super();
	}

	@BeforeMethod
	public void setUp() {

		// This method Invoke browser
		initialization();

		// Initialize class objects
		homepage = new HomePage();
		loginpage = new LoginPage();
		registerpage = new RegisterPage();
		homepage.SignInClick();

	}

	@Test
	public void registerUser()

	{
		// Create Account under Sign In.
		loginpage.createAccount();
		// Add the registration details to form and create the new account
		registerpage.Register();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
