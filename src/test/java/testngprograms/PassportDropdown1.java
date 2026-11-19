package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PassportDropdown1
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://services1.passportindia.gov.in/forms/registration");
    Thread.sleep(3000);
    
    WebElement e1= driver.findElement(By.xpath("//div[text()='Passport Office']"));
   e1.click();
  
  WebElement e2= driver.findElement(By.xpath("//select"));
  Select s1=new Select(e2);
//  s1.selectByVisibleText("Bengaluru");
  
  e2.sendKeys(Keys.ARROW_DOWN);
  Thread.sleep(3000);
  e2.sendKeys(Keys.ARROW_DOWN);
   
    
    
}
}
