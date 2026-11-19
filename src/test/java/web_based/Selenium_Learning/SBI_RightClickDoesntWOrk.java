package web_based.Selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_RightClickDoesntWOrk
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://yonoretail.sbi.bank.in/registration/welcome?srcChn=RINB");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
    Options option=driver.manage();
    Window a1=  option.window();
    a1.maximize();
    Thread.sleep(3000);
    WebElement e2= driver.findElement(By.id("mat-input-1"));
    e2.sendKeys("Madhu@123");
	
	
}
}
