package PracticeDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnWindow 
{
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "/Users/ameyaallampallewar/Documents/Dhanu Automation/Framework/com.learnCucumber/chromedriver 2");
		
		driver = new ChromeDriver();
		Thread.sleep(2000);

		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		
		WebElement SignIn=driver.findElement(By.xpath("//span[contains(.,'Hello')]"));
		WebElement YourAcc=driver.findElement(By.xpath("//span[contains(text(),'Your Account')]"));
		
		a.moveToElement(SignIn).build().perform();
		Thread.sleep(500);

		a.moveToElement(YourAcc).click().build().perform();
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		//right click
		
		WebElement UrOrders=driver.findElement(By.xpath("//h2[contains(text(),'Your Orders')]"));
		a.contextClick(UrOrders).keyDown("copy").click().build().perform();
		Thread.sleep(3000);
	
		driver.quit();
	}
}
