package testngprograms;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFetcchingdata2
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
{
	FileInputStream f1=new FileInputStream("C:\\Users\\Madhuchandan V\\eclipse-workspace\\Selenium_Learning\\test-output\\Excelsheets\\Maddy1.xlsx");
   Workbook wb=	WorkbookFactory.create(f1);
  Sheet s1= wb.getSheet("LoginData");
     Row r1=s1.getRow(0);
   Cell c1 =r1.getCell(0);
   String username=  c1.getStringCellValue();
   
   
   String password=wb.getSheet("LoginData").getRow(0).getCell(1).getStringCellValue();
  ChromeDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
  Thread.sleep(3000);
  WebElement e1= driver.findElement(By.id("ap_email_login"));
  
  Thread.sleep(3000);
  e1.sendKeys(username);
  
  driver.findElement(By.id("continue")).click();
  Thread.sleep(3000);
  WebElement e2=  driver.findElement(By.id("ap_password"));
  e2.sendKeys(password);
	
	
}    
    
}
