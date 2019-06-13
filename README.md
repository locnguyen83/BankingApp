# BankingApp Automation Test Exercise #1 - Write a suite of three automated browser tests for demo banking app at http://demo.guru99.com/v4   

#Overview
Page Object model Test automation framework using Selenium with Java, Junit, Cucumber and Serenity
                 
###Dependency
Java
Maven

###libraries /technologies used
Selenium WebDriver
Junit
Cucumber 
Serenity - Beautiful, interactive and detailed reports for tests
Browser chrome/firefox

### Steps to execute the tests
1. Get source from github :https://github.com/locnguyen83/BankingApp (If you are download as "Download as Zip then please rename the project to "BankingApp")
2. Open config.properties (location: src\test\java\com\credit\qc\config) modify location for web drivers as
       driverPath=<chromeDriverLocation>\\chromedriver.exe (ex: C\:\\Users\\locnguyen\\seleniumdrivers\\chromedriver.exe)
3.Open cmd (command prompt) and cd to "BankingApp"
4. Typing mvn clean test serenity:aggregate
5. Report of test suite location: BankingApp\target\site\serenity\index.html