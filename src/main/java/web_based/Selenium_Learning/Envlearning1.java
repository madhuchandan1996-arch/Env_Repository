package web_based.Selenium_Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.cdimascio.dotenv.Dotenv;

public class Envlearning1
{
 public static void main(String[] args)
{
	
	 
	 Dotenv env=	 Dotenv.load();
	 String url=	env.get("url");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	
	String un=	env.get("us");
	String pwd=env.get("password");
System.out.println(un);
System.out.println(pwd);

	
}
}
