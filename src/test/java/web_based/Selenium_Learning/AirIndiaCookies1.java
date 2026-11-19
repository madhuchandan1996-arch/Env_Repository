package web_based.Selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirIndiaCookies1
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.airindia.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement e1= driver.findElement(By.id("onetrust-accept-btn-handler"));
	e1.click();
// WebElement e2=driver.findElement(By.id("onetrust-pc-btn-handler")); this for manage cookies
//	e2.click();
	 
}
}
