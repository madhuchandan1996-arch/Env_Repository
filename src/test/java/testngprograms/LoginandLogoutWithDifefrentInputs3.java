package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class LoginandLogoutWithDifefrentInputs3 {

    @Test
    public void tc2_LoginToAMazonLogout() throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

        SoftAssert a1 = new SoftAssert();

        Thread.sleep(2000);

        WebElement e1 = driver.findElement(By.id("ap_email_login"));
        e1.sendKeys("madhuchandan1996@gmail.com");

        Thread.sleep(2000);

        a1.assertEquals(false, true); // just for fun

        WebElement e2 = driver.findElement(By.id("continue"));
        e2.click();

        WebElement e3 = driver.findElement(By.id("ap_password"));
        e3.sendKeys("Madhuchandan@1996");

        WebElement signin = driver.findElement(By.id("signInSubmit"));
        signin.click();

        // Assert.assertEquals(driver.getTitle(),
        // "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

        // Assertion a1 = new Assertion();

        a1.assertEquals(driver.getTitle(),"Manish Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

        a1.assertAll();
    }
}