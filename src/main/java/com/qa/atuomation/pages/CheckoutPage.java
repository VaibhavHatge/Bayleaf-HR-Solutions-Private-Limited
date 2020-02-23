package com.qa.atuomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.automation.testbase.TestBase;

public class CheckoutPage extends TestBase {

	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}

	// Object repository

	@FindBy(xpath = "//*[text()='Proceed to checkout']")
	WebElement checkout_btn;

	@FindBy(xpath = "//input[@id='cgv']")
	WebElement agree_checkbox;

	@FindBy(xpath = "//*[@id=\"center_column\"]/div/span/strong")
	WebElement total_price;

	@FindBy(xpath = "//*[@id='HOOK_PAYMENT']/div[1]/div")
	WebElement payment_method;

	@FindBy(xpath = "//*[text()='I confirm my order']")
	WebElement confirm_order;

	@FindBy(xpath = "//button[@name='processCarrier']")
	WebElement checkout_btn1;

	// Payment checkout
	public void checkout() {
		checkout_btn.click();
		checkout_btn.click();
		agree_checkbox.click();
		checkout_btn1.click();
		payment_method.click();
		confirm_order.click();

	}

}
