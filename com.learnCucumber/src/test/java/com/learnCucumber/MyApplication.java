package com.learnCucumber;

import org.openqa.selenium.By;
import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import ExtentReport.HTMLReport;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyApplication {

	//final static Logger logger = Logger.getLogger(MyApplication.class.getName());

	public static WebDriver driver;
	
	@When("^Open Firefox and start application$")
	public void open_Firefox_and_start_application() throws Throwable 
	{
		// Write code here that turns the phrase above into concrete actions

		try 
			{
				Thread.sleep(1000);

				System.setProperty("webdriver.gecko.driver","/Users/ameyaallampallewar/Documents/Dhanu Automation/Framework/com.learnCucumber/geckodriver");
				// System.setProperty("webdriver.chrome.driver",
				// "/Users/ameyaallampallewar/Documents/Dhanu
				// Automation/Framework/com.learnCucumber/chromedriver 2");
				//System.setProperty("https.proxyHost", "myProxy");
				//	System.setProperty("https.proxyPort", "80");

				driver = new FirefoxDriver();
				System.out.println("Mozilla Firefox Headless Browser Initialized");

				driver.manage().window().maximize();

				driver.get("https://www.facebook.com/");
				//Thread.sleep(5000);
				System.out.println("Page Title is : " + driver.getTitle());

				//String message = "Status:PASS,Step Number:" + Config.counter++ + ",Step: opens and start appliation"
				//			+ "exception:NA";
				//	logger.info(message);
					
				HTMLReport.StepDetails("pass", "Open Firefox and start application", "Parameter Browser= Firefox ","");
			} 
				
			catch (Exception ex)
			{	
				HTMLReport.StepDetails("fail", "Open Firefox and start application", "Browser= Firefox ","");

				//String message = "Status:FAIL,Step Number:" + Config.counter++ + ",Step: opens and start appliation" + "exception:" + ex.getMessage();
				//	logger.error(message);
			}		
	}


	@And("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_enter_valid_and_valid(String uname, String pass) throws Throwable 
	{
		try 
		{
			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uname);

			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);

			//String message = "Status:PASS,Step Number:" + Config.counter++ + ",Step:Step : i enter valid" + uname+ "and valid" + pass + "exception:NA";
			//logger.info(message);
			//Thread.sleep(3000);
			
			HTMLReport.StepDetails("pass", "I enter valid "+uname+" and valid "+pass+"", "Parameter uname= "+uname+", pwd="+pass+" ","");
		} 
		
		catch (Exception ex)
		{
			HTMLReport.StepDetails("fail", "I enter valid "+uname+" and valid "+pass+"", "uname= NA, pwd=NA ","");
		}
	}

	@Then("^user should login successfully$")
	public void user_should_login_successfully() throws Throwable 
	{
		try
		{
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@value='Log In']")).click();
			//String message = "Status:PASS,Step Number:" + Config.counter++ ",Step:Step :User Should Login Successfully" + "exception:NA";
		//	logger.info(message);
		
			HTMLReport.StepDetails("pass", "user should login successfully", "Parameter NA ", "");
			
		} 
		
		catch (Exception ex) 
		{
			HTMLReport.StepDetails("fail", "user should login successfully", "Parameter NA ", "");
		}
}

	@And("^application should be closed$")
	public void application_should_be_closed() throws Throwable 
	{
		try
		{
			Thread.sleep(1000);
		
			HTMLReport.StepDetails("pass", "Enter valid uname and password", "Parameter= NA ","");

			driver.close();		
		}
		
		catch (Exception ex) 
		{
			HTMLReport.StepDetails("fail", "Enter valid uname and password", "Parameter= NA ","");
		}

	}

}
