package testngprograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase9
{
  @BeforeMethod
  public void launchbrowser()
  {
	  System.out.println("Before Method");
  }
  @AfterMethod
  public void quitbrowser()
  {
	  System.out.println("After Method");
  }
  @Test
  public void tc1_LoginToAmazon()
  {
	  System.out.println("Test Case");
	  ChromeDriver driver=new ChromeDriver();
  }
}
