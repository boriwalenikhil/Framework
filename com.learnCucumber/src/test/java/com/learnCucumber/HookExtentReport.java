package com.learnCucumber;
import java.io.IOException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookExtentReport {
	


		public class cucumberHookExtentreport {

			public boolean isFirstScenario = true;
			
			@Before
			
			public void beforeScenario(Scenario obj)throws IOException{
				try {
			   HTMLReportGenerator.TestSuiteStart("facebook.html","testextentreport");
				}
				catch(Exception ex){
					System.out.println("error message"+ex.getMessage());
					System.out.println("This will run before scenario");

				}
				
				HTMLReportGenerator.TestCaseStart(obj.getName(),obj.getId()+" "+obj.getStatus()+" "+obj.getSourceTagNames().toString());

			}
			
			@After
			public void afterScenario() {
				

				System.out.println("This will run before scenario");
				Config.Counter = 1;
				
				HTMLReportGenerator.TestCaseEnd();
				HTMLReportGenerator.TestSuiteEnd();
				
			}
			
		}
		
	
}
