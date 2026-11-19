package practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoSuggestion
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
	
	 Thread.sleep(3000);
	List<WebElement>e2= driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
	int count= e2.size();
	System.out.println(count);
	e2.get(count-5).click();
	 
	 
}
}

//div[@class='left-pane-results-container']/div