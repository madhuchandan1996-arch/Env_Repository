package web_based.Selenium_Learning;
//How to find the number of links present in the given page
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsamApplicationXpath4
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
    List<WebElement> e1=driver.findElements(By.xpath("//a"));
    int count=  e1.size();
    System.out.println(count);
}
}
