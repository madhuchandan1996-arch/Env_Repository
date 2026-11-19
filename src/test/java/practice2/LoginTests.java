package practice2;

import org.testng.annotations.Test;

public class LoginTests
{
 @Test(priority=1)
 void loginByEmail()
 {
	 System.out.println("This is loging by email");
 }
 @Test(priority=2)
 void loginByFacebook()
 {
	 System.out.println("This is loging by Facebook");
 }
 @Test(priority=3)
 void loginByTwitter()
 {
	 System.out.println("This is loging by Twitter");
 }
}
