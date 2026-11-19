package web_based.Selenium_Learning;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	
	 driver.get("https://www.flipkart.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[text()='✕']")).click();
	 
	WebElement e1= driver.findElement(By.name("q"));
	e1.sendKeys("T-Shirts");
	e1.sendKeys(Keys.ENTER);
	
 List<WebElement>e2=driver.findElements(By.xpath("(//div[@class='bLCLBY nr15la'])[1]"));
	 e2.get(0).click();
	 
	 Set<String> ids= driver.getWindowHandles();
     Iterator<String> pcid=        ids.iterator();
     String parentid=        pcid.next();
     String childid=        pcid.next();
     
     driver.switchTo().window(childid);
     Thread.sleep(2000);
	 
 driver.findElement(By.xpath("//div[text()='Add to cart']")).click(); 

 
}
}
