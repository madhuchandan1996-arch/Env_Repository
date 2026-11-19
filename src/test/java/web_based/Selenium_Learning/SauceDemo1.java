package web_based.Selenium_Learning;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SauceDemo1 {

    @Test
    public void purchase_product() throws InterruptedException {

        SoftAssert a1 = new SoftAssert();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // Home page scenario is displayed or not
        String Title = driver.getTitle();
        a1.assertEquals(Title, "Swag Labs");
        System.out.println("Home Page is displayed");

        WebElement e1 = driver.findElement(By.id("user-name"));
        e1.sendKeys("standard_user");

        WebElement e2 = driver.findElement(By.id("password"));
        e2.sendKeys("secret_sauce");

        WebElement e3 = driver.findElement(By.id("login-button"));
        e3.click();

        a1.assertEquals(driver.findElement(By.className("inventory_list")).isDisplayed(),true);

        System.out.println("Product list is displayed");

        driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']")).click();
        Thread.sleep(3000);

        a1.assertEquals(By.className("inventory_details"), true);
        System.out.println("Inventory details page is displayed");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[.='Add to cart']")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("shopping_cart_container")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("checkout")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("continue")).click();

        WebElement e4 = driver.findElement(By.id("first-name"));
        e4.sendKeys("madhu");

        Thread.sleep(3000);
        WebElement e5 = driver.findElement(By.id("last-name"));
        e5.sendKeys("chandan");

        Thread.sleep(3000);
        WebElement e6 = driver.findElement(By.id("postal-code"));
        e6.sendKeys("12345");

        driver.findElement(By.id("continue")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("finish")).click();
        a1.assertAll();

    }
}
