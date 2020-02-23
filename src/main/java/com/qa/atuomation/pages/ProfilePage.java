package com.qa.atuomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.automation.testbase.TestBase;

public class ProfilePage extends TestBase {

	public ProfilePage() {
		PageFactory.initElements(driver, this);
	}

	// Object Repository
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement women_label;

	@FindBy(xpath = "//div[@class='header_user_info'][1]")
	WebElement user_name;

	@FindBy(xpath = "//tr[@class='first_item ']/td[3]")
	WebElement price_column;

	@FindBy(xpath = "//*[text()='Order history and details']")
	WebElement order_history_details;

	// Actions OR Methods
	public void women_click() {
		women_label.click();
	}

	public void username_click() {
		user_name.click();
	}

	public void orderHistoryClick() {
		order_history_details.click();
	}

	public String price_column() {
		String tableprice = price_column.getText();
		return tableprice;
	}

}
