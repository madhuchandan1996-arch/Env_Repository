package web_based.Selenium_Learning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class growtechmindspayment1 {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://grotechminds.com/payments/");

        Thread.sleep(3000);

        // Enter Card Number
        WebElement e1 = driver.findElement(By.id("cardNumber"));
        e1.sendKeys("12345678");

        // Enter Expiry Date
        WebElement e2 = driver.findElement(By.id("expiryDate"));
        e2.sendKeys("1234");

        // Enter CVV
        WebElement e3 = driver.findElement(By.id("cvv"));
        e3.sendKeys("0134");

        // Select Card Type
        WebElement e4 = driver.findElement(By.name("cardType"));

        Select s1 = new Select(e4);
        s1.selectByIndex(1);

        Thread.sleep(2000);

        // Enter Amount
        WebElement e5 = driver.findElement(By.id("amount"));
        e5.sendKeys("500");

        Thread.sleep(2000);

        // Save Card
        driver.findElement(By.id("saveCard")).click();

        Thread.sleep(3000);

        // Make Payment
        driver.findElement(By.xpath("//input[@value='Make Payment']")).click();

        Thread.sleep(3000);

        // Print page details
        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Close Browser
        driver.quit();
    }
}
