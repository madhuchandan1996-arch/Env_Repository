package practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Meeshu
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.meesho.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("T-shirts");
	
/*	Thread.sleep(3000);
List<WebElement>e1=	driver.findElements(By.xpath("//div[@class='sc-dQkurY ProductListItem__GridCol-sc-1baba2g-0 jsoufA eucHxL']"));
	e1.get(0).click();
	
	*/
	 
	 
}
}
