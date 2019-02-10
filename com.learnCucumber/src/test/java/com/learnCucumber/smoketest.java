package com.learnCucumber;

import org.openqa.selenium.By;
import org.apache.log4j.Logger;

import java.net.UnknownHostException;

import org.apache.log4j.LogManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.learnCucumber.HookExtentReport.cucumberHookExtentreport;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smoketest {

	final static Logger logger = Logger.getLogger(smoketest.class.getName());

	WebDriver driver;

	

@When("^Open \"(.*?)\" and start application$")
public void open_and_start_application(String browsername) throws Throwable {
   
	// Write code here that turns the phrase above into concrete actions
			try {

				System.setProperty("webdriver.firefox.driver","E:\\DRIVERS\\Firefox Setup 46.0.1.exe");
				
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				String message = "Status:PASS,Step Number:" + Config.Counter + ",Step:open and start application"+ browsername + "exception:NA";
				logger.info(message);
		       HTMLReportGenerator.StepDetails("PASS", "opens the"+browsername+"browser and start application","Browser name:"+browsername+",exception:NA","");
	           HTMLReportGenerator.StepDetails("PASS", "opens the"+browsername+"User open the browser", "","");
			} catch (Exception ex) {

				String message = "Status:FAIL,Step Number:" + Config.Counter + ",Step:open and start application:"
						+ "exception:" + ex.getMessage();
				logger.error(message);
			}
	
	
}

@When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
public void i_enter_valid_and_valid(String uname, String pass) throws Throwable {
    
	try {

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
		String message = "Step:PASS" + " I enter valid username:" + uname + "and password:" + pass + "Exception:NA";
		logger.info(message);
		HTMLReportGenerator.StepDetails("PASS", "opens the"+pass+"browser and start application","Browser name:"+pass+",exception:NA","");
		Thread.sleep(2000);

	} catch (Exception ex) {
String message = "Step:FAIL" + "I enter valid username:" + uname + "and password:" + pass + "Exception:" + ex.getMessage();
		logger.error(message);

	}
	
	
}

@Then("^user should login successfully$")
public void user_should_login_successfully() throws Throwable {
   
	try {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		String message = "Step :PASS" + "user should login successfully" + "Exception:NA";
		logger.info(message);
		HTMLReportGenerator.StepDetails("PASS", "opens the"+""+"browser and start application","Browser name:"+""+",exception:NA","");

	} catch (Exception ex) {

		String message = "Step :FAIL" + "user should login successfully" + "Exception:" + ex.getMessage();
		logger.error(message);

	}	
	
}

@Then("^application should be closed$")
public void application_should_be_closed() throws Throwable {
   
	try {
		driver.close();
		String message = "Step :PASS" + "application should be closed" + "Exception:NA";
		logger.info(message);
		HTMLReportGenerator.StepDetails("PASS", "opens the"+""+"browser and start application","Browser name:"+""+",exception:NA","");

	} catch (Exception ex) {

		String message = "Step :FAIL" + "application should be closed" + "Exception:" + ex.getMessage();
		logger.error(message);

	}
	
	
}

	
	
	
	
	

	


}
