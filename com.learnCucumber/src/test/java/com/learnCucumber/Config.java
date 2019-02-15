package com.learnCucumber;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.OutputType;
import org.codehaus.plexus.util.FileUtils;

public class Config {

	public static int counter = 1;
	
	static WebDriver driver;

	
	// This is new commit from nikhil Screenshot code
public static String TakeScreenShot(String ImagePath,WebDriver driver,long ms) throws IOException{
		

			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File(ImagePath);
			FileUtils.copyFile(src, dest);
			
			
			String s = dest.toString();
		    System.out.println("Screenshot Taken!!!!");
			return s;


	    
	
		  
	}
}
