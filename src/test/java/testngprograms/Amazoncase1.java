package testngprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
//Program1: Login to Amazon with valid credentials                      

public class Amazoncase1
{
    @Test
	public void login() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.id("ap_email_login"));
		e1.sendKeys("madhuchandan1996@gmail.com");
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
	    WebElement e2=	driver.findElement(By.name("password"));
	    e2.sendKeys("Madhuchandan@1996");
	 
	   Thread.sleep(3000);
	   driver.findElement(By.id("signInSubmit")).click();
		
	//	Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	//	Assertion a1=new Assertion();
	    SoftAssert a1=new SoftAssert();
		a1.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
}
