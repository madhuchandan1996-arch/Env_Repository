package web_based.Selenium_Learning;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllURL 
{
        public static void main(String[] args) throws InterruptedException 
        {
                        ChromeDriver driver=new ChromeDriver();                
                        driver.get("https://www.google.com/");
                        driver.manage().window().maximize();
                        Thread.sleep(3000);
                        
                        List<WebElement> e1= driver.findElements(By.xpath("//a"));
                        
                        for(int i=0;i<e1.size();i++)
                        {
                        WebElement e2= e1.get(i);
                        String title= e2.getText();
                        System.out.println(title);
                        String url= e2.getDomAttribute("href");
                        System.out.println(url);
        }
        }
}
