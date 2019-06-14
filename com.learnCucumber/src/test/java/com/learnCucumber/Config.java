package com.learnCucumber;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.OutputType;
import org.codehaus.plexus.util.FileUtils;

public class Config {

	public static int counter = 1;
	static WebDriver driver;
	static String imgpath=" /Users/ameyaallampallewar/Desktop/Result ";

	// This is new commit from nikhil Screenshot code
	/* public static void TakeScreenShot(String Screenshotname,WebDriver driver) {
		
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;

			File source = ts.getScreenshotAs(OutputType.FILE);
		//	File dest = new File(ImagePath);

			FileUtils.copyFile(source, new File("./ScreenshotFolder/"+Screenshotname+".png"));
			System.out.println("Screenshot taken");

			//String s = dest.toString();
			//return s;

		} catch (Exception e) {
			
			System.out.println("Exception while taking Screenshot"+e.getMessage());
			
			e.printStackTrace();
		}

		//return ImagePath;

	}
*/
	
	public static String TakeScreenShot(WebDriver driver,String screenshotname) throws IOException{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(imgpath+screenshotname+".png");
		FileUtils.copyFile(src, dest);
		String s = dest.toString();
		return s;
	}
	
	
	
	
	
}