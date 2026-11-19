package web_based.Selenium_Learning;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchQANames
{
    public static void main(String[] args) throws InterruptedException
    {
        ChromeDriver driver = new ChromeDriver();

        driver.get("file:///C:/Users/Madhuchandan%20V/Downloads/employee.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        List<WebElement> names = driver.findElements(
            By.xpath("//table[@id='employeeTable']//tr[td[normalize-space()='QA']]/td[2]"));

        for (WebElement name : names)
        {
            System.out.println(name.getText());
        }

        driver.quit();
    }
}
