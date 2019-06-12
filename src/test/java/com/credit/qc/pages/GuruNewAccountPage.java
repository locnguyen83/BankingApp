package com.credit.qc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.credit.qc.base.TestBase;

public class GuruNewAccountPage extends TestBase {

	// Page Factory

	// Web elements - Add a new Account

	@FindBy(xpath = "//p[@class='heading3']")
	WebElement addNewAccountMsg;

	@FindBy(xpath = "//input[@name='cusid']")
	WebElement inputCusId;

	@FindBy(xpath = "//select[@name='selaccount']")
	WebElement selAccount;

	@FindBy(xpath = "//input[@name='inideposit']")
	WebElement iniDeposit;

	@FindBy(xpath = "//input[@name='button2']")
	WebElement submitBtn;

	// Account Generated Successfully!!!
	
	@FindBy(xpath = "//td[text()='Account ID']/../td[2]")
	WebElement accountId;
	
	@FindBy(xpath = "//td[text()='Account Type']/../td[2]")
	WebElement accountType;
	
	@FindBy(xpath = "//td[text()='Date of Opening']/../td[2]")
	WebElement doo;
	
	@FindBy(xpath = "//td[text()='Current Amount']/../td[2]")
	WebElement currentAmount;
	
	// Initializing the Page Objects:
	public GuruNewAccountPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions method

	public String getNewAccountMsg() {
		return addNewAccountMsg.getText();
	}

	public void addNewAccount(String cusId, String selAcc, String iniDep) {
		inputCusId.sendKeys(cusId);

		Select selelectAccountType = new Select(selAccount);
		selelectAccountType.selectByVisibleText(selAcc);

		iniDeposit.sendKeys(iniDep);
		submitBtn.click();
	}
	
	public String getAccountId () {
		return accountId.getText();
	}
	
	public String getAccountType () {
		return accountType.getText();
	}
	
	public String getDoO () {
		return doo.getText();
	}
	public String getCurrentAmount () {
		return currentAmount.getText();
	}
}
