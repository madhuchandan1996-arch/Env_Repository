package web_based.Selenium_Learning;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;


public class AmazonHoverOver1 
{
        public static void main(String[] args) throws InterruptedException, IOException  
        {
                EdgeDriver driver=new EdgeDriver();        
                driver.manage().window().maximize();
                        driver.get("https://www.amazon.in/");
                        Options option=driver.manage();
                        Window window=        option.window();
                        window.maximize();
                        Thread.sleep(2000);
                        WebElement e2=        driver.findElement(By.linkText("Mobiles"));
                                e2.click();
                                
                        TakesScreenshot ts=        driver;        
                        File source=ts.getScreenshotAs(OutputType.FILE);
                //        File destination=new File("C:\\Users\\MKT\\eclipse-workspace\\AB72\\screenshot\\testcase.png");        
                        File destination=new File("C:\\Users\\MKT\\eclipse-workspace\\AB72\\screenshot\\testcase"+Math.random()+".png");        
                        FileHandler.copy(source, destination);
        }
}
