package com.credit.qc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.credit.qc.base.TestBase;

public class GuruDepositPage extends TestBase {

	// Page Factory

	@FindBy(xpath = "//input[@name='accountno']")
	WebElement accountNo;

	@FindBy(xpath = "//input[@name='ammount']")
	WebElement amount;

	@FindBy(xpath = "//input[@name='desc']")
	WebElement desc;

	@FindBy(xpath = "//input[@name= 'AccSubmit']")
	WebElement submitBtn;

	// Deposit Successfully!!!

	@FindBy(xpath = "//td[text()='Account No']/../td[2]")
	WebElement accountNo1;

	@FindBy(xpath = "//td[text()='Amount Credited']/../td[2]")
	WebElement amountCredited;	

	@FindBy(xpath = "//td[text()='Type of Transaction']/../td[2]")
	WebElement typeOfTransaction;
	
	@FindBy(xpath = "//td[text()='Current Balance']/../td[2]")
	WebElement curBlance;

	@FindBy(xpath = "//td[text()='Description']/../td[2]")
	WebElement desc1;

	// Initializing the Page Objects:
	public GuruDepositPage() {
		PageFactory.initElements(driver, this);
	}

	public void sendAccountNo(String accNo, String a, String strDesc) {
		accountNo.sendKeys(accNo);
		amount.sendKeys(a);
		desc.sendKeys(strDesc);
		submitBtn.click();
	}
	
	public String getAccountId() {
		return accountNo1.getText();
	}
	public String getAmountCredited() {
		return amountCredited.getText();
	}
	public String getTypeOfTransaction() {
		return typeOfTransaction.getText();
	}
	public String getCurBlance() {
		return curBlance.getText();
	}
	public String getDesc() {
		return desc1.getText();
	}
	
	
}
