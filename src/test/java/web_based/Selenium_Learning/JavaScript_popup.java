package web_based.Selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_popup
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://grotechminds.com/javascript-popup/");
    
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//button[text()='Click ']")).click();
    
    Thread.sleep(3000);
   
  String msg=   driver.switchTo().alert().getText();
  System.out.println(msg);
    Thread.sleep(3000);
    driver.switchTo().alert().accept();
    
}
}
