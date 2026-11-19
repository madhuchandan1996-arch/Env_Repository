package testngprograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase11
{
   @BeforeMethod
   public void launch()
   {
	   System.out.println("launch");
   }
   @AfterMethod
   public void quit()
   {
	   System.out.println("Quit");
   }
   @Test
   public void login()
   {
	   System.out.println("Test Case 1");
   }
   
   @Test
   public void searching()
   {
	   System.out.println("Test Case 2");
   }
}
