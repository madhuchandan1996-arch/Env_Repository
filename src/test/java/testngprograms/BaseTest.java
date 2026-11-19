package testngprograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest
{
 ChromeDriver driver;
 @BeforeMethod
 public void launchBrowser()
 {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
 }
 
 @AfterMethod
 public void quitBrowser() throws InterruptedException
 {
	 Thread.sleep(3000);
	 driver.quit();
 }


}
