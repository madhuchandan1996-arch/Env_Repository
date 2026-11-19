package testngprograms;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demoblaze1 implements IRetryAnalyzer {

    ChromeDriver driver;
    int count = 0;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
    }

    @Test(retryAnalyzer = Demoblaze1.class)
    public void addProductToCart() throws InterruptedException {

        Thread.sleep(3000);

        // Verify homepage
        Assert.assertTrue(driver.getTitle().contains("STORE"));

        // Click Laptops category
        WebElement e1 = driver.findElement(By.xpath("(//a[@id='itemc'])[3]"));
        e1.click();

        Thread.sleep(3000);

        // Click Sony vaio i5
        WebElement e2 = driver.findElement(By.xpath("//a[text()='Sony vaio i5']"));
        e2.click();

        Thread.sleep(3000);

        // Verify product name
        String name = driver.findElement(By.xpath("//h2[@class='name']")).getText();
        Assert.assertEquals(name, "Sony vaio i5");

        // Verify product price
        String price = driver.findElement(By.xpath("//h3[@class='price-container']")).getText();
        Assert.assertTrue(price.contains("790"));

        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);

        // Click Add to Cart
        WebElement e3 = driver.findElement(By.xpath("//a[text()='Add to cart']"));
        e3.click();

        Thread.sleep(2000);

       
        Alert a1 = driver.switchTo().alert();
        System.out.println(a1.getText());
        a1.accept();

        // Click Cart
        driver.findElement(By.id("cartur")).click();

        Thread.sleep(3000);

        // Verify product in cart
        String cartProduct = driver.findElement(By.xpath("//td[text()='Sony vaio i5']")).getText();

        Assert.assertEquals(cartProduct, "Sony vaio i5");

        System.out.println("Product successfully added to cart");
    }

    // Retry failed test maximum 2 times
    @Override
    public boolean retry(ITestResult result) {
        if (count < 2) {
            count++;
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

