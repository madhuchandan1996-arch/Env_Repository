package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestionfrom10th
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
    WebElement e1=	driver.findElement(By.name("q"));
	e1.sendKeys("India");
	 
	Thread.sleep(3000);
	WebElement e2= driver.findElement(By.xpath("((//ul[@role='listbox']/li)[10]/preceding-sibling::li)[1]"));
	e2.click();
}
}
