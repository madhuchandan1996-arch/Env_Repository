package testngprograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase12
{
 @BeforeMethod
 public void launch()
 {
	 System.out.println("Launch the Browser");
 }
 @AfterMethod
 public void quit()
 {
	 System.out.println("Quit the Browser");
 }
 @Test
 public void registration()
 {
	 System.out.println("Test case 3");
 }
 @Test
 public void login()
 {
	 System.out.println("Test Case 1");
 }
 @Test
 public void searching()
 {
	 System.out.println("Test case 2");
 }
}
