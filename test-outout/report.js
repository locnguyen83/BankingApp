$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resource/Features/addnewcustomer.feature");
formatter.feature({
  "name": "Demo Banking System",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify new customer can be created",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@newCustomer"
    }
  ]
});
formatter.step({
  "name": "User login to Guru99 Bank with \"\u003cusername\u003e\" and \"\u003cuserpass\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Title of login page is Guru99 Bank Manager Homepage displays \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click to New Customer on the left menu",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter valid values to all field to add a New Customer \"\u003ccustomername\u003e\", \"\u003cgender\u003e\", \"\u003cdateofbrith\u003e\", \"\u003caddress\u003e\", \"\u003ccity\u003e\", \"\u003cstate\u003e\", \"\u003cpinno\u003e\", \"\u003cphone\u003e\", \"\u003cemail\u003e\", \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "See the Customer Registered Successfully message",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify the correctness of Customer Registered \"\u003ccustomername\u003e\", \"\u003cgender\u003e\", \"\u003cdateofbrith\u003e\", \"\u003caddress\u003e\", \"\u003ccity\u003e\", \"\u003cstate\u003e\", \"\u003cpinno\u003e\", \"\u003cphone\u003e\", \"\u003cemail\u003e\", \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "userpass",
        "customername",
        "gender",
        "dateofbrith",
        "address",
        "city",
        "state",
        "pinno",
        "phone",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "mngr201145",
        "urEpUta",
        "Loc Nguyen",
        "male",
        "01-23-1983",
        "Nguyen Van Dau Binh Thanh",
        "HCM",
        "VN",
        "123456",
        "0909999999",
        "@aaa.com",
        "12345678"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify new customer can be created",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@newCustomer"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User login to Guru99 Bank with \"mngr201145\" and \"urEpUta\"",
  "keyword": "Given "
});
formatter.match({
  "location": "DemoBankingSystemTest.user_login_guru99_page(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Title of login page is Guru99 Bank Manager Homepage displays \"mngr201145\"",
  "keyword": "When "
});
formatter.match({
  "location": "DemoBankingSystemTest.title_of_login_page_is_guru99_bank_manager_homepage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click to New Customer on the left menu",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoBankingSystemTest.user_clicks_on_new_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid values to all field to add a New Customer \"Loc Nguyen\", \"male\", \"01-23-1983\", \"Nguyen Van Dau Binh Thanh\", \"HCM\", \"VN\", \"123456\", \"0909999999\", \"@aaa.com\", \"12345678\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoBankingSystemTest.enter_valid_values_to_all_field_to_add_a_new_customer(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "See the Customer Registered Successfully message",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoBankingSystemTest.verify_Customer_Registered_Successfully_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the correctness of Customer Registered \"Loc Nguyen\", \"male\", \"01-23-1983\", \"Nguyen Van Dau Binh Thanh\", \"HCM\", \"VN\", \"123456\", \"0909999999\", \"@aaa.com\", \"12345678\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoBankingSystemTest.verify_the_correctness_of_customer_registerd(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify to create new account based on the customer just created above",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@newAccount"
    }
  ]
});
formatter.step({
  "name": "Login with \"\u003cusername\u003e\" and \"\u003cuserpass\u003e\" and navigate to New Account",
  "keyword": "Given "
});
formatter.step({
  "name": "Add new account page is loaded",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "Add new account form"
      ]
    }
  ]
});
formatter.step({
  "name": "Enter valid values to create new account \"\u003caccounttype\u003e\", \"\u003cinitialdeposit\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify new account information \"\u003ccustomername\u003e\", \"\u003caccounttype\u003e\", \"\u003cinitialdeposit\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "userpass",
        "customername",
        "accounttype",
        "initialdeposit"
      ]
    },
    {
      "cells": [
        "mngr201145",
        "urEpUta",
        "Loc Nguyen",
        "Current",
        "11000"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify to create new account based on the customer just created above",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@newAccount"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login with \"mngr201145\" and \"urEpUta\" and navigate to New Account",
  "keyword": "Given "
});
formatter.match({
  "location": "DemoBankingSystemTest.navigate_to_new_account(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add new account page is loaded",
  "rows": [
    {
      "cells": [
        "Add new account form"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "DemoBankingSystemTest.add_new_account_page_is_loaded(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid values to create new account \"Current\", \"11000\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoBankingSystemTest.enter_valid_Values_to_create_new_account(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify new account information \"Loc Nguyen\", \"Current\", \"11000\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoBankingSystemTest.verify_new_account_information(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify deposit function work fine with the account just created.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Deposit"
    }
  ]
});
formatter.step({
  "name": "Login with \"\u003cusername\u003e\" and \"\u003cuserpass\u003e\" and navigate to Deposit",
  "keyword": "Given "
});
formatter.step({
  "name": "Deposit page is loaded",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "Amount Deposit Form"
      ]
    }
  ]
});
formatter.step({
  "name": "Enter valid values for deposit \"\u003camount\u003e\", \"\u003cdesc\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify deposit information \"\u003camount\u003e\", \"\u003cdesc\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "userpass",
        "amount",
        "desc"
      ]
    },
    {
      "cells": [
        "mngr201145",
        "urEpUta",
        "1000",
        "test desc"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify deposit function work fine with the account just created.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Deposit"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login with \"mngr201145\" and \"urEpUta\" and navigate to Deposit",
  "keyword": "Given "
});
formatter.match({
  "location": "DemoBankingSystemTest.navigate_to_deposit(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Deposit page is loaded",
  "rows": [
    {
      "cells": [
        "Amount Deposit Form"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "DemoBankingSystemTest.Deposit_page_is_loaded(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid values for deposit \"1000\", \"test desc\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoBankingSystemTest.enter_valid_values_for_deposit(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify deposit information \"1000\", \"test desc\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoBankingSystemTest.verify_deposit_informationt(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});