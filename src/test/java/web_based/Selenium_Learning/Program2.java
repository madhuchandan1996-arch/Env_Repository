package web_based.Selenium_Learning;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2
{
  public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	String browserparentid=  driver.getWindowHandle();
	System.out.println(browserparentid);
	
    Set<String>pcid=	driver.getWindowHandles();
    System.out.println(pcid);
    Thread.sleep(3000);
    driver.close();
	  
	  
}
}
