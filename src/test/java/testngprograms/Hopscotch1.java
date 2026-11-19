package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hopscotch1 implements IRetryAnalyzer {

    ChromeDriver driver;
    int count = 0;

    @BeforeMethod
    public void openBrowser() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hopscotch.in/");
    }

    @Test(retryAnalyzer = Hopscotch1.class)
    public void searchAndCheckout() throws InterruptedException {

        Thread.sleep(5000);

        // Verify homepage
        Assert.assertTrue(driver.getTitle().length() > 0);

        // Search for Shoes
        WebElement search = driver.findElement(
                By.xpath("//input[@type='search']"));

        search.sendKeys("Shoes");
        search.submit();

        Thread.sleep(5000);

        // Click first product
        WebElement product = driver.findElement(
                By.xpath("(//div[contains(@class,'plp-image-container')])[1]"));

        product.click();

        Thread.sleep(5000);

        // Enter pincode
        WebElement pincode = driver.findElement(
                By.xpath("//input[@type='text'][1]"));

        pincode.sendKeys("560010");

        // Click Check Pincode
        driver.findElement(
                By.xpath("//button[text()='Check Pincode']")).click();

        Thread.sleep(3000);

        // Add to Cart
        driver.findElement(
                By.xpath("//button[text()='ADD TO CART']")).click();

        Thread.sleep(3000);

        // View Cart
        driver.findElement(
                By.xpath("//button[text()='VIEW CART']")).click();

        Thread.sleep(3000);

        // Proceed to Checkout
        driver.findElement(
                By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

        Thread.sleep(3000);

        // Enter mobile number
        WebElement mobile = driver.findElement(
                By.xpath("//input[@type='tel']"));

        mobile.sendKeys("8009900785");

        // Click Continue
        driver.findElement(
                By.xpath("//button[text()='CONTINUE']")).click();

        Thread.sleep(3000);

        System.out.println("Product search and checkout steps completed.");

    }

    // Retry failed test maximum 2 times
    @Override
    public boolean retry(ITestResult result) {

        if (count < 2) {
            count++;
            System.out.println("Retry attempt: " + count);
            return true;
        }

        return false;
    }

    @AfterMethod
    public void closeBrowser() {

        if (driver != null) {
            driver.quit();
        }
    }
}