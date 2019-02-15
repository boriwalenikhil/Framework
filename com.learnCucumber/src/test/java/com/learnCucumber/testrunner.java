package com.learnCucumber;


import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
features = {"src/test/resources/MyApplication.feature"},
tags={"@tag"}
)
/*@CucumberOptions(
plugin = {"html:target/cucumber",
		"json:target/cucumber.jso,
		"html:target/cucumber-html-report",
		"usage:target/cucumber-usage.json",
		"junit:target/cucumber-result.xml",
		},
		*/
		

//dryRun = false   // check each method corre




public class testrunner {
/*
	@AfterClass
	public static void teardown() {

		Reporter.loadXMLConfig(new File("com.learnCucumber/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}
	*/
}
	
	
	

