package testngprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
//Login to amazon with valid credentials and then logout

public class Amazoncase2a
{
    @Test
	public void login() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.id("ap_email_login"));
		e1.sendKeys("madhuchandan1996@gmail.com"); //valid user_name
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
	    WebElement e2=	driver.findElement(By.name("password"));
	    e2.sendKeys("Madhuchandan@1996"); //correct Password
	 
	   Thread.sleep(3000);
	   driver.findElement(By.id("signInSubmit")).click();
		
        WebElement e3=  driver.findElement(By.id("nav-link-accountList"));
        Actions a1=new Actions(driver);
        a1.moveToElement(e3).perform();
    
       Thread.sleep(3000);
    
       WebElement e5= driver.findElement(By.linkText("Sign Out"));
       e5.click();
      
     Assert.assertEquals(driver.getTitle(),"Sign in");   
      
     
    
		
	}
}
