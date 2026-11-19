package web_based.Selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsamApplicationXpath3
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Madhuchandan%20V/Downloads/learningHTML1.html");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
    WebElement e1=	driver.findElement(By.xpath("//a"));
    e1.click();
	
	 
	 
}
}
