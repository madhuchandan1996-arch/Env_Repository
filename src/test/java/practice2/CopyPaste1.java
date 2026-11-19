package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste1
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/registeration-form/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
    WebElement e1=driver.findElement(By.id("email"));
    e1.sendKeys("madhuchandan");
    
    e1.sendKeys(Keys.CONTROL+"A");
    e1.sendKeys(Keys.CONTROL+"C");
    
    WebElement e2=  driver.findElement(By.id("phone"));
    e2.sendKeys(Keys.CONTROL+"V");
    
    
    
    
  
	 
}
}
