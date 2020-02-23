package com.qa.automation.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.atuomation.pages.HomePage;
import com.qa.atuomation.pages.LoginPage;
import com.qa.automation.testbase.TestBase;

public class LoginPageTest extends TestBase {

	HomePage homepage;
	LoginPage loginpage;

	public LoginPageTest() {
		super();
	}

	@BeforeTest
	public void setUp() {

		homepage = new HomePage();
		loginpage = new LoginPage();
		homepage.SignInClick();

	}

	@Test
	public void createAccountTest() {

		loginpage.createAccount();
	}

	@Test
	public void signIn() {
		loginpage.signIn();
	}
}
