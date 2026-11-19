package testngprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class DataProviderPrograms2
	{
	 @DataProvider
	 public Object logindata1()
	 {
		 Object d1[][]=new Object[2][1];
		 //Login to Amazon with Valid Credentials
		 d1[0][0]="Login";
		 d1[1][0]="Login and Logout";
		
		return d1;
	     
	}


	@Test(dataProvider="logindata1")
	public void tc2_LoginToAMazonLogout(String Case) throws InterruptedException
	{
	    
         ChromeDriver driver=new ChromeDriver();
	     driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

	     Thread.sleep(2000);
	     WebElement e1= driver.findElement(By.id("ap_email_login"));
	     e1.sendKeys("madhuchandan1996@gmail.com");
	     Thread.sleep(2000);

	     WebElement e2= driver.findElement(By.id("continue"));
	     e2.click();
	     
	     WebElement e3= driver.findElement(By.id("ap_password"));
	     e3.sendKeys("Madhuchandan@1996");
//	       
	     
	     WebElement signin= driver.findElement(By.id("signInSubmit"));
	     signin.click();
	     
	 }
	

}
