package com.credit.qc.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/Resource/Features", //the path of the feature files
		glue={"com.credit.qc.stepDefinitions"},
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false, //to check the mapping is proper between feature file and step def file
		junit = "--step-notifications",
		tags = {}
)//the path of the step definition files

public class TestRunner {
	
}