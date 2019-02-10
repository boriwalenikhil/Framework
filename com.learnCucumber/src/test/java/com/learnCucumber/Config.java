package com.learnCucumber;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.OutputType;
import org.codehaus.plexus.util.FileUtils;

public class Config {

	public static int Counter = 1;
	
	static WebDriver driver;

	public static void capturescreenshot(String Screenname) throws IOException {
		
		File srcshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcshot,new File ("/Users/ameyaallampallewar/Desktop/fb1/fail.png"));
	}
}
