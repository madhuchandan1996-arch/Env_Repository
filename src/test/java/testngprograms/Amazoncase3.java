package testngprograms;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
//Login to Amazon and searching the product                        

public class Amazoncase3
{

	@Test
	public void login() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	    WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
	    e1.sendKeys("toys");
	    
		Thread.sleep(3000);
        WebElement e2= driver.findElement(By.id("nav-search-submit-button"));
        e2.click();
      
        Thread.sleep(3000);
        List<WebElement>e3= driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
        Assert.assertEquals(e3.size()>=10, true);
        
    
    
      
}
}
