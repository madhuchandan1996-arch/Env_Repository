package testngprograms;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllOptionsDropdown
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
    Thread.sleep(3000);
    
  List<WebElement>Alloptions= driver.findElements(By.xpath("//select[@id='searchDropdownBox']/child::option"));
  System.out.println("Total Dropdown options:"+Alloptions.size());
  
  for(int i=0;i<Alloptions.size();i++)
  {
	String Text= Alloptions.get(i).getText();
	System.out.println(Text);
  }
  
  }
}
