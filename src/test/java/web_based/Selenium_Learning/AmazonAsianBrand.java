package web_based.Selenium_Learning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAsianBrand {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);

        // Search for Shoes
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Shoes");
        search.submit();

        Thread.sleep(3000);

        // Click on ASIAN brand checkbox

    WebElement asian = driver.findElement(By.xpath("//span[normalize-space()='ASIAN']"));

    asian.click();

    Thread.sleep(3000);


        Thread.sleep(3000);

      //  driver.quit();
    }
}
