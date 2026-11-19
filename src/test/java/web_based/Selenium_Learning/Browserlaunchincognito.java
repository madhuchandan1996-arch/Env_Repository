package web_based.Selenium_Learning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browserlaunchincognito
{
 public static void main(String[] args)
{
	ChromeOptions options=new ChromeOptions();
     options.addArguments("incognito");
     ChromeDriver a1=new ChromeDriver(options);        
     a1.get("https://www.google.com");
     String title= a1.getTitle();
     System.out.println(title);
             if(title.equals("MKT"))
             {
                     System.out.println("Test Case is pass");
             }
             else
             {
                     System.out.println("Test Case is failed");
             }
}
}
