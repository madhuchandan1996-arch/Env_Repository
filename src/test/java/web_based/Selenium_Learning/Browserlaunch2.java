package web_based.Selenium_Learning;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch2
{
 public static void main(String[] args) throws InterruptedException
{
	
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	 
	 Thread.sleep(3000);
	 System.out.println(driver.getTitle());
	 String Browser_id= driver.getWindowHandle();
	 System.out.println(Browser_id);
	
      Set<String>pcid=	driver.getWindowHandles();
      System.out.println(pcid);
      Thread.sleep(2000);
      driver.quit();
}
}
