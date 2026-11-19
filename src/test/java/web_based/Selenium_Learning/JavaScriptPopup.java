package web_based.Selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopup
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/javascript-popup/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='btnjs']")).click();
	
    driver.switchTo().alert().accept();
	
    String a1=	driver.getTitle();
    System.out.println(a1);
	 
	 
}
}
