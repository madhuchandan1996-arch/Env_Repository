package testngprograms;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
//Login to Amazon search product add it to cart->reach till payment page                        
public class Amazoncase5
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
		
        Thread.sleep(3000);
	    WebElement e3=	driver.findElement(By.id("twotabsearchtextbox"));
	    e3.sendKeys("toys");
	    
		Thread.sleep(3000);
        WebElement e4= driver.findElement(By.id("nav-search-submit-button"));
        e4.click();
      
        Thread.sleep(3000);
        List<WebElement>e5= driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
        e5.get(0).click();
        
        Set<String>ids= driver.getWindowHandles();
        Iterator<String> pcid= ids.iterator();
        String parentid= pcid.next();
        String childid= pcid.next();
        
        driver.switchTo().window(childid);
    
        Thread.sleep(3000);
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(3000);
    
        driver.findElement(By.name("proceedToRetailCheckout")).click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(), "Place Your Order - Amazon Checkout","Sorry Assertion failed 1");
        
      
}
}
