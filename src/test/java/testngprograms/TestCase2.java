package testngprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2
{
 @Test
 public void AmazonAutoSuggestion() throws InterruptedException
 {
	    System.out.println("Amazon Autosugestion and clicking");

	    ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Toys");
	    Thread.sleep(3000);
	   
	    List<WebElement> e1=   driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
	    int count=  e1.size();
	    System.out.println(count);
	    e1.get(count-1).click();
	   
	   
 }
	
	
}
