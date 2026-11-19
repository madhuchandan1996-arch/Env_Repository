package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AmazonReporter1
{
 @Test
 public void searching_product() throws InterruptedException
 {
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	 Reporter.log("Browser launched successfully");
	 
	 Thread.sleep(3000);
	WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("watch");
	e1.sendKeys(Keys.ENTER);
	Reporter.log("Product was searched successfully");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline']")).click();
	Reporter.log("First Product clicked on successfully");
	
	 
	 
	 
 }
}
