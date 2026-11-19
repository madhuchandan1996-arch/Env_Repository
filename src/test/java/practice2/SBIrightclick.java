package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBIrightclick
{
  public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://yonoretail.sbi.bank.in/registration/welcome?srcChn=RINB");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	  
	WebElement e1=  driver.findElement(By.id("mat-input-1"));
	e1.sendKeys("Madhu");
	  
}
}
//mat-input-1