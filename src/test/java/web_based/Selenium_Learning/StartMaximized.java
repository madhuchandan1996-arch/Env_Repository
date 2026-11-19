package web_based.Selenium_Learning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StartMaximized
{
 public static void main(String[] args)
{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("start-maximized");
	ChromeDriver a1=new ChromeDriver(options);
	a1.get("https://www.google.com");
	
}
}
