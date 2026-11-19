package web_based.Selenium_Learning;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 
{
       public static void main(String[] args) throws IOException, InterruptedException
	{
    	   Date d1=new Date();
    	   System.out.println(d1.getTime());
    	   Date d2=new Date(d1.getTime());
    	   System.out.println(d2);
    	   String time=d1.toString();
    	  String timeformat= time.replace(":", "");
    	   
    	   
    	   
    	   
    	ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	    WebElement e1=	driver.findElement(By.linkText("Mobiles"));
	    e1.click();
		TakesScreenshot ts=(TakesScreenshot) driver;
	    File source=ts.getScreenshotAs(OutputType.FILE);
	  // File Destination=new File("C:\\Users\\Madhuchandan V\\eclipse-workspace\\Selenium_Learning_part\\SS1\\testcase.png");
	  File Destination=new File("C:\\Users\\Madhuchandan V\\eclipse-workspace\\Selenium_Learning_part\\SS1\\testcase"+Math.random()+".png");
	  //  File Destination=new File("C:\\Users\\Madhuchandan V\\eclipse-workspace\\Selenium_Learning_part\\SS1\\testcase" +timeformat+ ".png");
	    FileHandler.copy(source, Destination);
	} 
}
