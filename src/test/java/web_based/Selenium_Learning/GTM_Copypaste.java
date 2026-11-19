package web_based.Selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class GTM_Copypaste 
{
        public static void main(String[] args) throws InterruptedException  
        {
                EdgeDriver driver=new EdgeDriver();        
                driver.manage().window().maximize();
                        driver.get("https://grotechminds.com/registeration-form/");
                        Thread.sleep(4000);

                        Options option=driver.manage();
                        Window window=        option.window();
                        window.maximize();
                        Thread.sleep(4000);
                        WebElement e2=        driver.findElement(By.id("firstName"));
                        e2.sendKeys("Vishal");
                        e2.sendKeys(Keys.CONTROL+"A");
                        e2.sendKeys(Keys.CONTROL+"C");
                        Thread.sleep(2000);
                        WebElement e3=        driver.findElement(By.id("lastName"));
                        e3.sendKeys(Keys.CONTROL+"V");

                        
                        
                        
                        
        }
}
