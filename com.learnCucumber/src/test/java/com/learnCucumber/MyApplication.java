package com.learnCucumber;

import org.openqa.selenium.By;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ExtentReport.HTMLReport;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyApplication extends Config
{

	//final static Logger logger = Logger.getLogger(MyApplication.class.getName());

	public static WebDriver driver;
	
	@When("^Open Firefox and start application$")
	public void open_Firefox_and_start_application() throws Throwable 
	{
		// Write code here that turns the phrase above into concrete actions

		try 
			{
				Thread.sleep(1000);

				//System.setProperty("webdriver.gecko.driver","/Users/ameyaallampallewar/Documents/Dhanu Automation/Framework/com.learnCucumber/geckodriver");
				 System.setProperty("webdriver.chrome.driver", "/Users/ameyaallampallewar/Documents/Dhanu Automation/Framework/com.learnCucumber/chromedriver 2");
				
				driver = new ChromeDriver();
				System.out.println("Mozilla Firefox Headless Browser Initialized");

				driver.manage().window().maximize();
				//Config.TakeScreenShot("browserStarted", driver);
				driver.get("https://www.facebook.com/");
				//	Config.TakeScreenShot("EnterUrl", driver);

				//Thread.sleep(5000);
				System.out.println("Page Title is : " + driver.getTitle());

				//String message = "Status:PASS,Step Number:" + Config.counter++ + ",Step: opens and start appliation"
				//			+ "exception:NA";
				//	logger.info(message);
		
				HTMLReport.StepDetails("pass", "Open Firefox and start application", "Parameter Browser= Firefox ",Config.TakeScreenShot(driver, "openbrowser"));
				
			}
		
			catch (Exception ex)
			{	
				HTMLReport.StepDetails("fail", "Open Firefox and start application", "Browser= Firefox ",Config.TakeScreenShot(driver, "failtoopenbrowser"));

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
			//Config.TakeScreenShot("Enterusername", driver);

			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
			//Config.TakeScreenShot("Enterpassword", driver);


			//String message = "Status:PASS,Step Number:" + Config.counter++ + ",Step:Step : i enter valid" + uname+ "and valid" + pass + "exception:NA";
			//logger.info(message);
			//Thread.sleep(3000);
			
			HTMLReport.StepDetails("pass", "I enter valid "+uname+" and valid "+pass+"", "Parameter uname= "+uname+", pwd="+pass+" ",Config.TakeScreenShot(driver, "usernameandpass"));
		} 
		
		catch (Exception ex)
		{
			HTMLReport.StepDetails("fail", "I enter valid "+uname+" and valid "+pass+"", "uname= NA, pwd=NA ",Config.TakeScreenShot(driver, "failtousername and pass"));
		}
	}

	@Then("^user should login successfully$")
	public void user_should_login_successfully() throws Throwable 
	{
		try
		{
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@value='Log In']")).click();
			//Config.TakeScreenShot("userlogin", driver);

			//String message = "Status:PASS,Step Number:" + Config.counter++ ",Step:Step :User Should Login Successfully" + "exception:NA";
		//	logger.info(message);
		
			HTMLReport.StepDetails("pass", "user should login successfully", "Parameter NA ",Config.TakeScreenShot(driver, "userloginsuccessfully"));	
		} 
		
		catch (Exception ex) 
		{
			HTMLReport.StepDetails("fail", "user should login successfully", "Parameter NA ",Config.TakeScreenShot(driver, "Failtouserloginsuccessfully"));	
		}
}

	@And("^application should be closed$")
	public void application_should_be_closed() throws Throwable 
	{
		try
		{
			Thread.sleep(1000);
		
			HTMLReport.StepDetails("pass", "Enter valid uname and password", "Parameter= NA ",Config.TakeScreenShot(driver, "applicationClosed"));
			//Config.TakeScreenShot("applicationClosed", driver);

			driver.close();		
		}
		
		catch (Exception ex) 
		{
			HTMLReport.StepDetails("fail", "Enter valid uname and password", "Parameter= NA ",Config.TakeScreenShot(driver, "FailtoapplicationClosed"));
		}
	}

	 @Then ("^user should  Fail to login successfully$")
	 
	public void fail_to_login() throws IOException 
	 {	
		 try
			{
				Thread.sleep(1000);			
				
				String expectedUrl = "https://www.facebook.com/";
				driver.get(expectedUrl);
				try
				{
				  Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
				  System.out.println("Navigated to correct webpage");
				}
				
				catch(Throwable pageNavigationError)
				{
				System.out.println("Didn't navigate to correct webpage");
				}

				//driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).click();
				
				//driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).click();
			//	Config.TakeScreenShot("FailtoLogin", driver);

				//String message = "Status:PASS,Step Number:" + Config.counter++ ",Step:Step :User Should Login Successfully" + "exception:NA";
			//	logger.info(message);
			
				HTMLReport.StepDetails("pass", "user should Failed to login ", "Parameter NA ",Config.TakeScreenShot(driver, "failtoinvalidlogin"));
				
			} 
			
			catch (Exception ex) 
			{
				HTMLReport.StepDetails("fail", "user should FAiled to login ", "Parameter NA ","Failto invlid login");
				
			}
	}
}
