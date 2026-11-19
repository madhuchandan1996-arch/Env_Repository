
package web_based.Selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay1 {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        // Enter the search keyword
        WebElement e1 = driver.findElement(By.id("gh-ac"));
        e1.sendKeys("toys");

        Thread.sleep(2000);

        // Click the Search button
        WebElement e2 = driver.findElement(
            By.xpath("//span[@class='gh-search-button__label']")
        );
        e2.click();

        Thread.sleep(3000);

        // Click the first carousel item, if present
        WebElement e3 = driver.findElement(
            By.xpath("(//li[contains(@class,'carousel__snap-point')])[1]")
        );
        e3.click();

        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}

