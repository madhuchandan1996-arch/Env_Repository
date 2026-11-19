package web_based.Selenium_Learning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserLaunchHeadlessMode1
{
 public static void main(String[] args)
{
	 ChromeOptions option=new ChromeOptions();
	 option.addArguments("headless");
	ChromeDriver a1=new ChromeDriver(option);
	a1.get("https://www.google.com");
	
	 
	 
}
}
