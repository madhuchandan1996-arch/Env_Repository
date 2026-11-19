package web_based.Selenium_Learning;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountTheLinksgoogle
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
    List<WebElement> e1=driver.findElements(By.tagName("a"));
    int a1=	e1.size();
    System.out.println(a1);
	 
	 
}
}
