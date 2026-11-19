package web_based.Selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTypeToys
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
    WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
    e1.sendKeys("Toys");
    
    Thread.sleep(3000);
    driver.findElement(By.id("nav-search-submit-button")).click();
    
	
	 
	 
}
}
