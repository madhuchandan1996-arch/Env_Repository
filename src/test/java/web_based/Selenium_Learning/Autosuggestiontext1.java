package web_based.Selenium_Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestiontext1
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Toys");
   Thread.sleep(3000);
   List<WebElement> e1=   driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
   for(int i=0;i<e1.size();i++)
   {
       WebElement e2= e1.get(i);
       String title=        e2.getText();
       System.out.println(title);
       
   }
   
    
	 
	 
	 
}
}
