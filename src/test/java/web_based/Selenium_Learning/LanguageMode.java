package web_based.Selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LanguageMode
{
 public static void main(String[] args)
{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("lang=ar");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://www.google.com");
	String Title= driver.getTitle();
	driver.findElement(By.name("q")).sendKeys("India is My Country");
	System.out.println(Title);
	 
	 
}
}
