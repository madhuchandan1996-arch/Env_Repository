package web_based.Selenium_Learning;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximizedstate1
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	
    Options option=driver.manage();
    Window window=  option.window();
    window.maximize();
	 
}
}
