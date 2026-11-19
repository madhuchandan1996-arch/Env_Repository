package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SameProgramwithDifferentInput
{
  @DataProvider
  public Object searchItems()
  {
	  Object [][]data=new Object[10][1];//rows*column
	  data[0][0]="shoe";
	  data[1][0]="laptop";
	  data[2][0]="charger";
	  data[3][0]="books";
	  data[4][0]="pen";
	  data[5][0]="fan";
	  data[6][0]="mobiles";
	  data[7][0]="computes";
	  data[8][0]="headphone";
	  data[9][0]="iphone";
	
	  return data;


  }
	
	@Test(dataProvider="searchItems")
	public void searchingProduct(String input) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(input);
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	
}
