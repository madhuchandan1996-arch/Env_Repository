package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	
	
	Thread.sleep(3000);
	WebElement e3= driver.findElement(By.id("1"));
	e3.sendKeys("7892961894");
	
	Thread.sleep(3000);
	e3.sendKeys(Keys.ENTER);
	
	 
	 
}
}
