package com.credit.qc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.credit.qc.base.TestBase;

/**
 * @author Loc Nguyen
 *
 */
public class LoginPage extends TestBase {

	// Page Factory
	@FindBy(xpath = "//input[@name='uid']")
	WebElement userId;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='btnLogin']")
	WebElement submitBtn;

	// Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	
	public GuruManagerPage loginToPage(String uId, String pwd) {
		userId.sendKeys(uId);
		password.sendKeys(pwd);
		if (submitBtn.isDisplayed()) {
			submitBtn.click();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new GuruManagerPage();
	}

}
