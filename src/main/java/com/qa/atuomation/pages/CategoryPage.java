package com.qa.atuomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.automation.testbase.TestBase;

public class CategoryPage extends TestBase {

	public CategoryPage() {
		PageFactory.initElements(driver, this);
	}

	// Object Repository

	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
	WebElement product;

	@FindBy(xpath = "//*[@id='quantity_wanted']")
	WebElement quantiy_number;

	@FindBy(xpath = "//*[@id='add_to_cart']/button")
	WebElement add_cart_btn;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	WebElement proceed_toCheckout_btn;

	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	WebElement frameid;

	@FindBy(xpath = "//*[@id='center_column']/div/span/strong")
	WebElement price;

	@FindBy(xpath = "//*[@id='order-list']/tbody/tr/td[3]/span")
	WebElement price1;

	@FindBy(xpath = "//*[@class='header_user_info'][1]")
	WebElement user_name;

	// methods OR Actions

	public String price_text() {
		return price.getText();
	}

	public String price1_text() {
		return price1.getText();
	}

	public void usernameClick() {
		user_name.click();
	}

	// Add product to the cart
	public void addProduct() {
		product.click();
		driver.switchTo().frame(frameid);
		quantiy_number.clear();
		quantiy_number.sendKeys("2");
		add_cart_btn.click();
		driver.switchTo().defaultContent();
		proceed_toCheckout_btn.click();

	}

}
