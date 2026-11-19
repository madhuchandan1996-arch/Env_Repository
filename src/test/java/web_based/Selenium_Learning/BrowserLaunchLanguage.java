package web_based.Selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserLaunchLanguage
{
 public static void main(String[] args)
{
	 ChromeOptions options=new ChromeOptions();
     options.addArguments("lang=ar");
     ChromeDriver a1=new ChromeDriver(options);        
     a1.get("https://www.google.com");
     String title=        a1.getTitle();
     a1.findElement(By.name("q")).sendKeys("India is my Country");
     System.out.println(title);
}
}
