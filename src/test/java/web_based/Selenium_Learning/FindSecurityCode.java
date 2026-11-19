package web_based.Selenium_Learning;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindSecurityCode
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.bseindia.com/markets/equity/equitysensexstream");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	
	 
	 
}
}
