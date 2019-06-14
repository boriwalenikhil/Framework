package TableExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 
{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{

	System.setProperty("webdriver.chrome.driver", "/Users/ameyaallampallewar/Documents/Dhanu Automation/Framework/com.learnCucumber/chromedriver 2");
	
	driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	
	Actions a=new Actions(driver);

	// moving mouse to some location
	
			Thread.sleep(2000);

			
			WebElement todaysDeals=driver.findElement(By.xpath("//div[@id='nav-xshop']/a[contains(text(),\"Today's Deals\")]"));
			todaysDeals.click();
			Thread.sleep(2000);
	
			WebElement cartBox=driver.findElement(By.xpath("//div[@id='100_dealView_0']\n"));
			cartBox.findElement(By.xpath("//button[@class='a-button-text a-text-center']")).click();
			
			Thread.sleep(5000);
			System.out.println("Hello");
			Thread.sleep(2000);


	
	//WebElement table=driver.findElement(By.cssSelector("div[class='sc-list-body sc-java-remote-feature']"));
	
	//int size=table.findElements(By.cssSelector("a-row sc-list-item sc-list-item-border sc-java-remote-feature")).size();
	//System.out.println(size);
			
			//driver.quit();

	}
}
