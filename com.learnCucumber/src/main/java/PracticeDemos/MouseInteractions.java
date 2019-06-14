package PracticeDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteractions 
{
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/ameyaallampallewar/Documents/Dhanu Automation/Framework/com.learnCucumber/chromedriver 2");
			
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		
		// moving mouse to some location
		
		WebElement SignIn=driver.findElement(By.xpath("//span[contains(.,'Hello')]"));
		a.moveToElement(SignIn).build().perform();
		Thread.sleep(2000);

		// Enter capital letters in search_box of amazon then press "Escape"
		WebElement txtbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		a.moveToElement(txtbox).click().keyDown(Keys.SHIFT).sendKeys("shoes",Keys.ESCAPE).build().perform();
		Thread.sleep(2000);

		//Right click on SignIn
		a.moveToElement(SignIn).contextClick().build().perform();
		Thread.sleep(3000);
		
		driver.quit();		
	}
}
