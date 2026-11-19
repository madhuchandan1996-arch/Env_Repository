package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginandLogoutWithDifefrentInputs2
{
 @DataProvider
 public Object logindata1()
 {
	 Object d1[][]=new Object[5][3];
	 //1st Row
	 d1[0][0]="madhuchandan1996@gmail.com";//valid email
	 d1[0][1]="Madhuchandan@1996"; //valid password
	 d1[0][2]="Login should be successful";
	 
	 //2nd Row
	 d1[1][0]="7892961894";//valid mobile
     d1[1][1]="Madhuchandan@1996";//valid password
     d1[1][2]="Login should be Successful";//valid password

     //3rd row
     d1[2][0]="madhuchandan1996@gmail.com";//valid email
     d1[2][1]="98765rdfgyu";//invalid password
     d1[2][2]="Login should not be Successful";//valid password
     
     //4th row
     d1[3][0]="mkumrban@        ";//invalid email
     d1[3][1]="456tg";//invalid password
     d1[3][2]="Login should not be Successful";//valid password

     //5th row
     d1[4][0]="";//blank
     d1[4][1]="";//blank
     d1[4][2]="Login should not be Successful";//valid password
     
     return d1;
     
}


@Test(dataProvider="logindata1")
public void tc2_LoginToAMazonLogout(String username ,String password,String message) throws InterruptedException
{
     System.out.println(message);

     ChromeDriver driver=new ChromeDriver();
     driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

     Thread.sleep(2000);
     WebElement e1= driver.findElement(By.id("ap_email_login"));
     e1.sendKeys(username);
     Thread.sleep(2000);

     WebElement e2= driver.findElement(By.id("continue"));
     e2.click();
     
     WebElement e3= driver.findElement(By.id("ap_password"));
     e3.sendKeys(password);
//        throw new NullPointerException();
     
     WebElement signin= driver.findElement(By.id("signInSubmit"));
     signin.click();
     
 }
}
