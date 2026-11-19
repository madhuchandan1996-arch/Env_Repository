package practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutosuggestion
{
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("shoes");
	
	 Thread.sleep(2000);
     List<WebElement> a2=  driver.findElements(By.xpath("//form/ul/li"));
    int count=  a2.size();
    System.out.println(count);
    
    a2.get(count-5).click();
}
}

//form/ul/li