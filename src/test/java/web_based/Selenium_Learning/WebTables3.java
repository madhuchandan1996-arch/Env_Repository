package web_based.Selenium_Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables3
{
 public static void main(String[] args)
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Madhuchandan%20V/Downloads/employee.html");
	driver.manage().window().maximize();
  List<WebElement>e1=driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr/td[1]"));
  
	for(int i=0;i<e1.size();i++)
	{
		String name=e1.get(i).getText();
		if(name.equals("Ram"))
		{
			System.out.println("Present");
			break;
		}
	}
 
	 
}
}
