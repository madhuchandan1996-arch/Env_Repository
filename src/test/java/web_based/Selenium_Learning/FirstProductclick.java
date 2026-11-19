package web_based.Selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProductclick
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
    WebElement e1=	driver.findElement(By.xpath("//input[@type='text']"));
    e1.sendKeys("toys"+Keys.ENTER);
    
    Thread.sleep(3000);
    WebElement e3= driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
    e3.click();
  
    
    
	
	 
	 
}
}
