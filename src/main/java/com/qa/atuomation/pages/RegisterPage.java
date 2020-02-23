package com.qa.atuomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.automation.testbase.TestBase;

public class RegisterPage extends TestBase {

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	// Object Repository

	@FindBy(xpath = "//input[@id='id_gender1']")
	WebElement gender_radio_btn;

	@FindBy(xpath = "//*[@id='customer_firstname']")
	WebElement fname_TextField;

	@FindBy(xpath = "//*[@id='customer_lastname']")
	WebElement lname_TextField;

	@FindBy(xpath = "//*[@id='email']")
	WebElement email_TextField;

	@FindBy(xpath = "//*[@id='passwd']")
	WebElement password_TextField;

	@FindBy(xpath = "//*[@id='firstname']")
	WebElement Afname_TextField;

	@FindBy(xpath = "//*[@id='lastname']")
	WebElement Alname_TextField;

	@FindBy(xpath = "//*[@id='company']")
	WebElement company_TextField;

	@FindBy(xpath = "//*[@id='address1']")
	WebElement address_TextField;

	@FindBy(xpath = "//*[@id='address2']")
	WebElement address1_TextField;

	@FindBy(xpath = "//*[@id='city']")
	WebElement city_TextField;

	@FindBy(xpath = "//*[@id='id_country']")
	WebElement country_dropdown;

	@FindBy(xpath = "//*[@id='id_state']")
	WebElement state_dropdown;

	@FindBy(xpath = "//*[@id='postcode']")
	WebElement postcode_TextField;

	@FindBy(xpath = "//*[@id='phone_mobile']")
	WebElement mobile_TextField;

	@FindBy(xpath = "//*[@id='alias']")
	WebElement alis_TextField;

	@FindBy(xpath = "//*[@id='submitAccount']")
	WebElement registerbtn;

	public void Register() {

		// Radio button select
		gender_radio_btn.click();
		// Enter data in Password Text filed
		password_TextField.sendKeys("ABC@123");
		// Enter data in First name Text filed
		fname_TextField.sendKeys("Sam");
		// Enter data in Last name Text filed
		lname_TextField.sendKeys("Cena");
		// Enter data in company Text filed
		company_TextField.sendKeys("Abcd");
		// Enter data in Address Text filed
		address_TextField.sendKeys("Midtown");
		// Enter data in Address(Line2) Text filed
		address1_TextField.sendKeys("L M road");
		// Enter data in City Text filed
		city_TextField.sendKeys("Mumbai");
		// Select third value from dropdown
		Select s = new Select(state_dropdown);
		s.selectByIndex(2);
		// Enter data in Postal code Text filed
		postcode_TextField.sendKeys("00008");
		// Enter data in Mobile Text filed
		mobile_TextField.sendKeys("8588785785");
		// Enter data in alias Text filed
		alis_TextField.sendKeys("This is sample data");
		// Click on Register button
		registerbtn.click();

	}
}
