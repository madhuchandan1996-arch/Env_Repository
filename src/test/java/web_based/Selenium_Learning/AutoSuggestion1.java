package web_based.Selenium_Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("Selenium");
	Thread.sleep(3000);
	List<WebElement> suggestions =
             driver.findElements(By.xpath("//ul[@role='listbox']//li"));

     // Print all suggestions
	Thread.sleep(3000);
     for (WebElement suggestion : suggestions) {
      System.out.println(suggestion.getText());
	 
	 
}
}
}
