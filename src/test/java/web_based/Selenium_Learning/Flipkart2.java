package web_based.Selenium_Learning;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//span[.='✕']")).click();
	
	Thread.sleep(3000);
    WebElement e1=	driver.findElement(By.name("q"));
    e1.sendKeys("T-shirts");
    e1.sendKeys(Keys.ENTER);
    
    Thread.sleep(3000);
    List<WebElement>e2=  driver.findElements(By.xpath("//div[@class='bLCLBY nr15la']"));
    e2.get(0).click();

   Set<String>ids=driver.getWindowHandles();
   Iterator<String>pcid=ids.iterator();
   String ParentId=pcid.next();
   String ChildId=pcid.next();
   driver.switchTo().window(ChildId);
           
   Thread.sleep(3000);
   driver.findElement(By.xpath("(//div[@class='grid-formation grid-column-2'])[7]")).click();
   
	
}
}
