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
//Login to Amazon search product and add it to cart                        

public class Amazoncase4
{

	@Test
	public void login() throws InterruptedException
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		SoftAssert a3=new SoftAssert();
		
		Thread.sleep(3000);
	    WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
	    e1.sendKeys("toys");
	    
		Thread.sleep(3000);
        WebElement e2= driver.findElement(By.id("nav-search-submit-button"));
        e2.click();
      
        Thread.sleep(3000);
        List<WebElement>e3= driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
        e3.get(0).click();
        
        Set<String>ids= driver.getWindowHandles();
        Iterator<String> pcid= ids.iterator();
        String parentid= pcid.next();
        String childid= pcid.next();
        
        driver.switchTo().window(childid);
    
    Thread.sleep(3000);
    driver.findElement(By.id("add-to-cart-button")).click();
    Thread.sleep(3000);
    
//    driver.findElement(By.name("proceedToRetailCheckout")).click();
      
  WebElement a1=  driver.findElement(By.xpath("//div[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']/h1"));
 // Assert.assertEquals(a1.getText(), "Madhu Added to cart");
 // Assertion a2=new Assertion();
  a3.assertEquals(a1.getText(), "Added to cart");
  a3.assertAll();
}
}
