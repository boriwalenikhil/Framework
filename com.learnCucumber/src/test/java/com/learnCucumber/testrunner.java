package com.learnCucumber;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"html:target/cucumber",
		"json:target/cucumber.json",
		"html:target/cucumber-html-report",
		"usage:target/cucumber-usage.json",
		"junit:target/cucumber-result.xml",
		"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"
		},
//plugin = {"pretty", "html:target/cucumber/output.json",
//"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},

features = {"src/test/resources/MyApplication.feature"},
tags={"@nikhil"},
dryRun = false   // check each method correctly attach or not.

)


public class testrunner {

	@AfterClass
	public static void teardown() {

		Reporter.loadXMLConfig(new File("com.learnCucumber/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}
	
	
	

