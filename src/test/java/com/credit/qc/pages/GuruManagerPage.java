package com.credit.qc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.credit.qc.base.TestBase;

public class GuruManagerPage extends TestBase {

	// Page Factory
	@FindBy(xpath = "//h2[@class='barone']")
	WebElement bankHeader;

	@FindBy(xpath = "//tr[@class='heading3']/td")
	WebElement logUser;
	
	// Web elements - Add a new Customer
	@FindBy(xpath = "//a[text()='New Customer']")
	WebElement newCustomerLink;

	@FindBy(xpath = "//a[text()='New Account']")
	WebElement newAccount;
	
	@FindBy(xpath = "//a[text()='Deposit']")
	WebElement deposit;
	
	@FindBy(xpath = "//input[@name='name']")
	WebElement name;

	@FindBy(xpath = "//input[@type= 'radio' and @value='m']")
	WebElement maleCheckBox;

	@FindBy(xpath = "//input[@type= 'radio' and @value='f']")
	WebElement femaleCheckBox;

	@FindBy(id = "dob")
	WebElement dataOfBirth;

	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement textAreaAddr;

	@FindBy(xpath = "//input[@name= 'city']")
	WebElement city;

	@FindBy(xpath = "//input[@name= 'state']")
	WebElement state;

	@FindBy(xpath = "//input[@name= 'pinno']")
	WebElement pinno;

	@FindBy(xpath = "//input[@name= 'telephoneno']")
	WebElement phone;

	@FindBy(xpath = "//input[@name= 'emailid']")
	WebElement email;

	@FindBy(xpath = "//input[@name= 'password']")
	WebElement pwd;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitBtn;

	// Web Elements - Registered successfully

	@FindBy(xpath = "//p[@class='heading3']")
	WebElement successffullyMsg;

	@FindBy(xpath = "//td[text()='Customer ID']/../td[2]")
	WebElement customerId;

	@FindBy(xpath = "//td[text()='Customer Name']/../td[2]")
	WebElement customerName;

	@FindBy(xpath = "//td[text()='Birthdate']/../td[2]")
	WebElement birthDate;

	@FindBy(xpath = "//td[text()='Address']/../td[2]")
	WebElement address;

	@FindBy(xpath = "//td[text()='Gender']/../td[2]")
	WebElement gender;

	@FindBy(xpath = "//td[text()='City']/../td[2]")
	WebElement city1;

	@FindBy(xpath = "//td[text()='State']/../td[2]")
	WebElement state1;

	@FindBy(xpath = "//td[text()='Pin']/../td[2]")
	WebElement pin1;

	@FindBy(xpath = "//td[text()='Mobile No.']/../td[2]")
	WebElement phoneNo1;

	@FindBy(xpath = "//td[text()='Email']/../td[2]")
	WebElement email1;

	// Initializing the Page Objects:
	public GuruManagerPage() {
		PageFactory.initElements(driver, this);
	}

	public String getPageTile() {
		return driver.getTitle();
	}

	public void clickNewCustomerMenu() {
		newCustomerLink.click();
	}
	
	public GuruNewAccountPage clickNewAccount() {
		newAccount.click();
		return new GuruNewAccountPage();
	}
	
	public GuruDepositPage clickDeposit() throws InterruptedException {
		deposit.click();
		Thread.sleep(2000);
		return new GuruDepositPage();
	}
	public void addNewCustomer(String csName, String gender, String dob, String addr, String strCity, String strState,
			String intPin, String intPhone, String strEmail, String strPwd) throws Exception {
		name.sendKeys(csName);
		if (gender.contentEquals("male")) {
			maleCheckBox.click();
		} else if (gender.contentEquals("female")) {
			femaleCheckBox.click();
		} else {
			throw new Exception("element not found");
		}
		dataOfBirth. sendKeys(dob);
		textAreaAddr.sendKeys(addr);
		city.sendKeys(strCity);
		state.sendKeys(strState);
		pinno.sendKeys(intPin);
		phone.sendKeys(intPhone);
		email.sendKeys(strEmail);
		pwd.sendKeys(strPwd);
		if (submitBtn.isEnabled()) {
			submitBtn.click();
		}
		Thread.sleep(1000);
	}
	public String getSuccessfullyMsg() {
		return successffullyMsg.getText();
	}
	
	public String getcsId () {
		return customerId.getText();
	}
	public String getcsName () {
		return customerName.getText();
	}
	
	public String getGender () {
		return gender.getText();
	}
	
	public String getAddr () {
		return address.getText();
	}
	
	public String getDoB () {
		return birthDate.getText();
	}
	
	public String getCity () {
		return city1.getText();
	}
	
	public String getState () {
		return state1.getText();
	}
	
	public String getPinNo () {
		return pin1.getText();
	}
	
	public String getEmail () {
		return email1.getText();
	}
	
	public String getPhone () {
		return phoneNo1.getText();
	}
	public String getLoginUser() {
		return logUser.getText();
	}
	/*
	 * public boolean checkCustomerInformation(String csName, String gender, String
	 * dob, String addr, String strCity, String strState, String intPin, String
	 * intPhone, String strEmail, String strPwd) {
	 * if(!custumerName.getText().equals(csName)) { Assert. return false; } return
	 * false; }
	 */

}
