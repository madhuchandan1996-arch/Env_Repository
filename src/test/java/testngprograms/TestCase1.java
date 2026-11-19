package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1
{
 @Test
 public void SearchingProduct() throws InterruptedException
 {
	 System.out.println("Amazon Searching the Product");
	 ChromeDriver driver=new ChromeDriver();                
     driver.get("https://www.amazon.in/");
     Thread.sleep(2000);
     driver.findElement(By.cssSelector("input[id^='twotabsearch']")).sendKeys("toys");
     Thread.sleep(2000);

     driver.findElement(By.id("nav-search-submit-button")).click();
     driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();

      System.out.println(driver.getWindowHandles());
      Thread.sleep(4000);
      driver.close();
 }
	
	
}
