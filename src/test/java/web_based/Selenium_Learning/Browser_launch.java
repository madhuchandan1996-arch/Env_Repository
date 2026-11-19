package web_based.Selenium_Learning;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
}
