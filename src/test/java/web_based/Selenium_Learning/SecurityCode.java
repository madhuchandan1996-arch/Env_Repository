package web_based.Selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecurityCode
{
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.bseindia.com/markets/equity/equitysensexstream");
	driver.manage().window().maximize();
	Thread.sleep(3000);
//	WebElement code = driver.findElement(By.xpath("//td[normalize-space()='NSE']/preceding-sibling::td[1]"));
 WebElement code=	driver.findElement(By.xpath("//b[text()=' HCLTECH ']/parent::*/parent::*/parent::*/td[@class='td-integer-center']"));
   System.out.println("Security Code: " + code.getText());
	 
}

}
