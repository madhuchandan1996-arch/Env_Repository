package web_based.Selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleRightClick
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
    WebElement e1=	driver.findElement(By.xpath("//a[text()='About']"));
    Actions a1=new Actions(driver);
    a1.contextClick(e1).perform();

}
}
