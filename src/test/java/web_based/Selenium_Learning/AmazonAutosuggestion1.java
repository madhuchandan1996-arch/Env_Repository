package web_based.Selenium_Learning;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutosuggestion1 {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Shoes");

        Thread.sleep(3000);

        WebElement e1 = driver.findElement(By.xpath("((//ul[@role='listbox']/li)[10]/preceding-sibling::li)[1]"));
        e1.click();
        Thread.sleep(3000);
        driver.quit();
    }
}

