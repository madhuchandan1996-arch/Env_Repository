package web_based.Selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoFacebook
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	WebElement e1=driver.findElement(By.name("email"));
	e1.sendKeys("Madhu Indium");
	

	WebElement e2=   driver.findElement(By.name("pass"));
	e2.sendKeys("Chandan@123");
	
	e2.sendKeys(Keys.ENTER);
	
	
	   
}
}
