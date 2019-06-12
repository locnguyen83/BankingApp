package com.credit.qc.stepDefinitions;

import com.credit.qc.base.TestBase;
import com.credit.qc.pages.GuruDepositPage;
import com.credit.qc.pages.GuruManagerPage;
import com.credit.qc.pages.GuruNewAccountPage;
import com.credit.qc.pages.LoginPage;
import com.credit.qc.util.TestUtil;

import java.util.List;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import cucumber.api.DataTable;

public class DemoBankingSystemTest extends TestBase {
	LoginPage loginPage;
	GuruManagerPage guruManagerPage;
	GuruNewAccountPage guruNewAccountPage;
	GuruDepositPage guruDepositPage;
	TestUtil testUtil;

	public static String customerEmail = null;
	public static String customerId = null;
	public static String accountId = null;
	public static int inideposit;
	public DemoBankingSystemTest() {
		super();
	}

	@Before
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
	}

	@Given("^User login to Guru99 Bank with \"(.*)\" and \"(.*)\"$")
	public void user_login_guru99_page(String username, String userpass) {
		guruManagerPage = loginPage.loginToPage(username, userpass);
	}

	@When("^Title of login page is Guru99 Bank Manager Homepage displays \"(.*)\"$")
	public void title_of_login_page_is_guru99_bank_manager_homepage(String username) {
		Assert.assertEquals(guruManagerPage.getPageTile(), "Guru99 Bank Manager HomePage");
		Assert.assertTrue("Could not login to Bank system", guruManagerPage.getLoginUser().contains(username));
	}

	@Then("^Click to New Customer on the left menu$")
	public void user_clicks_on_new_customer() {
		guruManagerPage.clickNewCustomerMenu();
	}

	@Then("^Enter valid values to all field to add a New Customer \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\"$")
	public void enter_valid_values_to_all_field_to_add_a_new_customer(String customername, String gender,
			String dateofbrith, String address, String city, String state, String pinno, String phone, String email,
			String password) throws Exception {
		
		customerEmail = testUtil.randomString(10) + email;
		guruManagerPage.addNewCustomer(customername, gender, dateofbrith, address, city, state, pinno, phone,
				customerEmail, password);

	}

	@Then("^See the Customer Registered Successfully message$")
	public void verify_Customer_Registered_Successfully_message() {
		Assert.assertEquals(guruManagerPage.getSuccessfullyMsg(), "Customer Registered Successfully!!!");
	}

	@Then("^Verify the correctness of Customer Registered \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\"$")
	public void verify_the_correctness_of_customer_registerd(String customername, String gender,
			String dateofbrith, String address, String city, String state, String pinno, String phone, String email,
			String password) {
		Assert.assertEquals(customername, guruManagerPage.getcsName());
		Assert.assertEquals(gender, guruManagerPage.getGender());
		String[] splitDate = dateofbrith.split("-");
		String date = splitDate[2] + "-" + splitDate[0] + "-" + splitDate[1];
		Assert.assertEquals(date, guruManagerPage.getDoB());
		Assert.assertEquals(address, guruManagerPage.getAddr());
		Assert.assertEquals(city, guruManagerPage.getCity());
		Assert.assertEquals(state, guruManagerPage.getState());
		Assert.assertEquals(pinno, guruManagerPage.getPinNo());
		Assert.assertEquals(phone, guruManagerPage.getPhone());
		Assert.assertEquals(customerEmail, guruManagerPage.getEmail());
		// set Customer ID
		customerId = guruManagerPage.getcsId();

	}

	@Given("^Login with \"(.*)\" and \"(.*)\" and navigate to New Account$")
	public void navigate_to_new_account(String username, String userpass) {
		guruManagerPage = loginPage.loginToPage(username, userpass);
		guruNewAccountPage = guruManagerPage.clickNewAccount();
	}

	@When("^Add new account page is loaded$")
	public void add_new_account_page_is_loaded(DataTable getPageMsg) {
		List<List<String>> data = getPageMsg.raw();
		Assert.assertEquals(guruNewAccountPage.getNewAccountMsg(), data.get(0).get(0));
	}

	@Then("^Enter valid values to create new account \"(.*)\", \"(.*)\"$")
	public void enter_valid_Values_to_create_new_account(String accounttype, String initialdeposit) {
		guruNewAccountPage.addNewAccount(customerId, accounttype, initialdeposit);
	}

	@Then("^Verify new account information \"(.*)\", \"(.*)\", \"(.*)\"$")
	public void verify_new_account_information(String customername, String accounttype, String initialdeposit) {
		Assert.assertEquals(customerId, guruManagerPage.getcsId());
		Assert.assertEquals(customername, guruManagerPage.getcsName());
		Assert.assertEquals(customerEmail, guruManagerPage.getEmail());
		Assert.assertEquals(accounttype, guruNewAccountPage.getAccountType());
		Assert.assertEquals(testUtil.getDate(), guruNewAccountPage.getDoO());
		Assert.assertEquals(initialdeposit, guruNewAccountPage.getCurrentAmount());
		
		// set accout Id
		accountId = guruNewAccountPage.getAccountId();
		//set initialdeposit
		inideposit = Integer.parseInt(guruNewAccountPage.getCurrentAmount());
	}

	@Given("^Login with \"(.*)\" and \"(.*)\" and navigate to Deposit$")
	public void navigate_to_deposit(String username, String userpass) throws InterruptedException {
		guruManagerPage = loginPage.loginToPage(username, userpass);
		guruDepositPage = guruManagerPage.clickDeposit();
	}

	@When("^Deposit page is loaded$")
	public void Deposit_page_is_loaded(DataTable getPageMsg) {
		List<List<String>> data = getPageMsg.raw();
		Assert.assertEquals(guruManagerPage.getSuccessfullyMsg(), data.get(0).get(0));
	}

	@Then("^Enter valid values for deposit \"(.*)\", \"(.*)\"$")
	public void enter_valid_values_for_deposit(String amount, String desc) {
		guruDepositPage.sendAccountNo(accountId, amount, desc);
	}

	@Then("^Verify deposit information \"(.*)\", \"(.*)\"$")
	public void verify_deposit_informationt(String amount, String desc ) {
		Assert.assertEquals(accountId, guruDepositPage.getAccountId());
		Assert.assertEquals(amount, guruDepositPage.getAmountCredited());
		Assert.assertEquals("Deposit", guruDepositPage.getTypeOfTransaction());
		Assert.assertEquals(desc, guruDepositPage.getDesc());
		int curBal = Integer.parseInt(amount) + inideposit;
		Assert.assertEquals(curBal,  Integer.parseInt(guruDepositPage.getCurBlance()));
	}

	@After
	public void close_the_browser() {
		driver.close();
	}

}
