package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase14
{
	
 @Test
 public void searching_on_amazon() throws InterruptedException
 {
	ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	 
	 Thread.sleep(3000);
	WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("Shoe");
	e1.sendKeys(Keys.ENTER);
	
	 
 }
}
