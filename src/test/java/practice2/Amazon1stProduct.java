package practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1stProduct
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement e1= driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
	 e1.sendKeys("Toys");
	 
	 Thread.sleep(3000);
	 driver.findElement(By.id("nav-search-submit-button")).click();
	 
	 Thread.sleep(3000);
	List<WebElement>e2= driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
	 e2.get(0).click();
}
}
