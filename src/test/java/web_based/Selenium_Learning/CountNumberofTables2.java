package web_based.Selenium_Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNumberofTables2
{
 public static void main(String[] args)
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Madhuchandan%20V/Downloads/employee.html");
	driver.manage().window().maximize();

 	
	  List<WebElement> list=driver.findElements(By.xpath("//table[@id='employeeTable']/thead/tr/th"));
	  for(int i=0;i<list.size();i++)
	   {
	      WebElement e2=list.get(i);
	      String text=e2.getText();
	      System.out.println(text);
	     
	   }
	  int countofcolumn=  list.size();
	  System.out.println(countofcolumn);
	  driver.quit();
	 
}
}
