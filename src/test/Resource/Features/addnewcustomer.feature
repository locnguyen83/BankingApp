Feature: Demo Banking System
@newCustomer
Scenario Outline: Verify new customer can be created

	Given  User login to Guru99 Bank with "<username>" and "<userpass>" 
	When Title of login page is Guru99 Bank Manager Homepage displays "<username>"
	Then Click to New Customer on the left menu
	Then Enter valid values to all field to add a New Customer "<customername>", "<gender>", "<dateofbrith>", "<address>", "<city>", "<state>", "<pinno>", "<phone>", "<email>", "<password>"
	Then See the Customer Registered Successfully message 
	Then Verify the correctness of Customer Registered "<customername>", "<gender>", "<dateofbrith>", "<address>", "<city>", "<state>", "<pinno>", "<phone>", "<email>", "<password>"
Examples:
 | username |  userpass  |customername|gender|dateofbrith|         address           | city|state| pinno |    phone   |email     |password |
 |mngr201145|urEpUta     | Loc Nguyen | male |01-23-1983 | Nguyen Van Dau Binh Thanh | HCM | VN  |123456 | 0909999999 | @aaa.com | 12345678|
 
@newAccount
Scenario Outline: Verify to create new account based on the customer just created above
	Given Login with "<username>" and "<userpass>" and navigate to New Account
	When Add new account page is loaded
	|Add new account form|
	Then Enter valid values to create new account "<accounttype>", "<initialdeposit>"
	Then Verify new account information "<customername>", "<accounttype>", "<initialdeposit>"
Examples:
| username |  userpass |customername|accounttype|initialdeposit|
|mngr201145|urEpUta    |Loc Nguyen  |Current    |11000         |

@Deposit
Scenario Outline: Verify deposit function work fine with the account just created.
	Given Login with "<username>" and "<userpass>" and navigate to Deposit
	When Deposit page is loaded
	|Amount Deposit Form|
	Then Enter valid values for deposit "<amount>", "<desc>"
	Then Verify deposit information "<amount>", "<desc>"
Examples:
| username | userpass|amount|desc      |
|mngr201145| urEpUta |1000  |test desc |