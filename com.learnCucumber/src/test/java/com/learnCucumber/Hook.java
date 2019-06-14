package com.learnCucumber;

import java.io.IOException;

import ExtentReport.HTMLReport;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

public boolean isFirstScenario = true;
	
	@Before
	
	public void beforeScenario(Scenario obj)throws IOException{

		System.out.println("This will run before scenario");
		
		
		HTMLReport.TestSuiteStart("/Users/ameyaallampallewar/Desktop/Result/Nikhil.html", "ejagruti");
        // get particular scenario name from login.features
        HTMLReport.TestCaseStart(obj.getName(), "This is description");
	
	}
	
	@After
	public void afterScenario() throws IOException {
		

		System.out.println("This will run before scenario");
	//	Config.counter = 1;
		
		//For HTML Report 

		HTMLReport.TestCaseEnd();
		HTMLReport.TestSuiteEnd();




       
	}

}
