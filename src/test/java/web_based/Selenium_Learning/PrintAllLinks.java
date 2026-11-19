package web_based.Selenium_Learning;

import java.util.List;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

    public static void main(String[] args) throws InterruptedException 
    {
    	ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links)       
        {
        	System.out.println(link.getText());
        }

        driver.quit();
    }
}