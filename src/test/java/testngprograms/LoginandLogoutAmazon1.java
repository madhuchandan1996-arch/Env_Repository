package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginandLogoutAmazon1
{
   @DataProvider
   public Object logindata()
   {
	   Object [][]d1=new Object[5][2];
	 //  1st row
	   d1[0][0]="madhuchandan1996@gmail.com"; //valid user_name
	   d1[0][1]="Madhuchandan@1996";//valid password
	   
	 //  2nd row
	   d1[1][0]="+123456789"; //valid mobile number
	   d1[1][1]="@1234"; //valid password
	   
	 // 3rd row
	   d1[2][0]="madhu@123"; //valid email
	   d1[2][1]="_123"; //invalid password
	   
	   //4th row
	   d1[3][0]="abhisheak123_gmail.com"; //invalid user_name
	   d1[3][1]="1234&"; //invalid password
			
	   //5th row
	   d1[4][0]=""; //blank user_name
	   d1[3][1]=""; //blank password
	   
	   
	   
	   
	   return d1;
   }
	
	@Test(dataProvider="logindata")
	public void logintoamazon(String username,String password) throws InterruptedException
	{
		
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 
	  WebElement e1= driver.findElement(By.id("ap_email_login"));
	 e1.sendKeys(username);
	 
	 Thread.sleep(2000);
	 driver.findElement(By.id("continue")).click();
	 
	 Thread.sleep(2000);
     WebElement e2=	 driver.findElement(By.id("ap_password"));
     e2.sendKeys(password);
     
	 Thread.sleep(2000);
	 driver.findElement(By.id("signInSubmit")).click();
	 
	 driver.quit();
		
	}
	
}
