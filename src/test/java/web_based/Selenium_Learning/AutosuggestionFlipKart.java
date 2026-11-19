package web_based.Selenium_Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionFlipKart
{
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	
    WebElement e1=	 driver.findElement(By.name("q"));
    e1.sendKeys("toys");
    Thread.sleep(3000);
 
    List< WebElement> e2 = driver.findElements(By.xpath("//ul/li"));
    e2.get(2).click();
    driver.close();
 
 
	
}
	
	
}
