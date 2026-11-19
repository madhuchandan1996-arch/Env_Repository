package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase13 extends LaunchQuit
{
 @Test
 public void login_to_amazon() throws InterruptedException
 {
	
	 
	Thread.sleep(3000);
	WebElement e1= driver.findElement(By.id("ap_email_login"));
	e1.sendKeys("madhuchandan1996@gmail.com");
	
	Thread.sleep(3000);
	driver.findElement(By.id("continue")).click();
	
	Thread.sleep(3000);
	WebElement e2=driver.findElement(By.id("ap_password"));
	e2.sendKeys("Madhuchandan@1996");
	
	Thread.sleep(3000);
	driver.findElement(By.id("signInSubmit")).click();
 }
}
