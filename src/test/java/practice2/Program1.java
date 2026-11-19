package practice2;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://sauce-demo.myshopify.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
    WebElement e1=	driver.findElement(By.id("search-field"));
    e1.sendKeys("T-shirts");

    Thread.sleep(3000);
    List<WebElement>e2= driver.findElements(By.id("product-1"));
    e2.get(0).click();

    Thread.sleep(3000);
    driver.findElement(By.id("add")).click();
	 
}
}
