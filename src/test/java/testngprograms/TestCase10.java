package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase10
{
  ChromeDriver driver;
  @BeforeMethod
  public void launchbrowser()
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }
  @AfterMethod
  public void quitbrowser() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.quit();
  }
  @Test
  public void tc1_LoginToAmazon() throws InterruptedException
  {
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	 driver.manage().window().maximize();
	 
	 Thread.sleep(3000);
	 WebElement e1= driver.findElement(By.id("ap_email_login"));
	 e1.sendKeys("madhuchandan1996@gmail.com");
	
	Thread.sleep(3000);
    WebElement e2=	driver.findElement(By.id("continue"));
    e2.click();
	
	 
	 
  }
  
}
