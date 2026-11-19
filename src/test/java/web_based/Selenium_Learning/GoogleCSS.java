package web_based.Selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleCSS
{
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
    WebElement e1= driver.findElement(By.cssSelector(".gLFyf"));
    e1.sendKeys("Education");
}
}
