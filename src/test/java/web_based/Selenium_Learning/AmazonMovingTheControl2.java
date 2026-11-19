package web_based.Selenium_Learning;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class AmazonMovingTheControl2 
{
        public static void main(String[] args) throws InterruptedException  
        {
                        EdgeDriver driver=new EdgeDriver();                
                        driver.get("https://www.amazon.in/");
                        driver.manage().window().maximize();
                        Thread.sleep(2000);
                        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
                        Thread.sleep(5000);

                        List<WebElement> list=        driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
                        int count=        list.size();
                        System.out.println(count);
                        list.get(count-1).click();
                        
                        List<WebElement> product1CLick=        driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
                        product1CLick.get(0).click();
                        
                        
                Set<String> ids= driver.getWindowHandles();
                Assert.assertEquals(ids.size()>1,true);
                
                
         /*       Iterator<String> pcid= ids.iterator();
                String parentid= pcid.next();
                String childid= pcid.next();
                
                driver.switchTo().window(childid);
                Thread.sleep(2000);
       //         driver.close();
       /// */
       
                
        }}
