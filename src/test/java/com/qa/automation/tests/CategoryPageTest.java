package com.qa.automation.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.atuomation.pages.CategoryPage;
import com.qa.atuomation.pages.CheckoutPage;
import com.qa.atuomation.pages.HomePage;
import com.qa.atuomation.pages.LoginPage;
import com.qa.atuomation.pages.ProfilePage;
import com.qa.automation.testbase.TestBase;

public class CategoryPageTest extends TestBase {

	HomePage homepage;
	LoginPage loginpage;
	ProfilePage profilepage;
	CategoryPage categorypage;
	CheckoutPage checkoutpage;

	public CategoryPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		// This method Invoke browser
		initialization();

		// Initialize class objects
		homepage = new HomePage();
		loginpage = new LoginPage();
		profilepage = new ProfilePage();
		categorypage = new CategoryPage();
		checkoutpage = new CheckoutPage();

	}

	@Test
	public void addProduct() {
		// Click on Sign-in link
		homepage.SignInClick();
		// Login with new user credentials
		loginpage.signIn();
		// Click WOMAN section
		profilepage.women_click();
		// It will select any 1 product by clicking on QUICK VIEW and adding 2 Qty for
		// the product to cart
		categorypage.addProduct();
		// Complete the checkout process by completing the payment flow
		checkoutpage.checkout();
		// Completed the payment process, under Profile page, verify the amount of order
		String price = categorypage.price_text();
		categorypage.usernameClick();
		profilepage.orderHistoryClick();
		String price1 = categorypage.price1_text();
		Assert.assertEquals(price, price1, "Order amount is same ");

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
