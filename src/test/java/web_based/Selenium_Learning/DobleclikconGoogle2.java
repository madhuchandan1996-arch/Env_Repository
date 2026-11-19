package web_based.Selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DobleclikconGoogle2
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
    WebElement e1=	driver.findElement(By.xpath("//textarea[@name='q']"));
    e1.sendKeys("news");
    
    Thread.sleep(3000);
    Actions a1=new Actions(driver);
    a1.doubleClick(e1).perform();
    
    Thread.sleep(3000);
    a1.contextClick(e1).perform();

}
}
