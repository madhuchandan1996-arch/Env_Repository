package web_based.Selenium_Learning;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Amazon1stproduct 
{
	@Test
        public  void searchingtheproduct() throws InterruptedException  
        {
                ChromeDriver driver=new ChromeDriver();                
                        driver.get("https://www.amazon.in/");
                        Thread.sleep(2000);
                        driver.findElement(By.cssSelector("input[id^='twotabsearch']")).sendKeys("toys");
                        Thread.sleep(2000);

                        driver.findElement(By.id("nav-search-submit-button")).click();
            /*            driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();
   
                         System.out.println(driver.getWindowHandles());
                         Thread.sleep(4000);
                         driver.close();
                         */
              List<WebElement>e2=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
              
              Assert.assertEquals(e2.size()>20, true,"Assertion failed 1");
              
        }
}

