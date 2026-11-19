package web_based.Selenium_Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNumberofTables1
{
 public static void main(String[] args)
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Madhuchandan%20V/Downloads/employee.html");
	driver.manage().window().maximize();
	List<WebElement>e1= driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr"));
	int countofrows=  e1.size();
	System.out.println(countofrows);
	 
	 
}
}
