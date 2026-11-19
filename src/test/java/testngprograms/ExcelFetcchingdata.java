package testngprograms;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFetcchingdata
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream f1=new FileInputStream("C:\\Users\\Madhuchandan V\\eclipse-workspace\\Selenium_Learning\\test-output\\Excelsheets\\Maddy1.xlsx");
   Workbook wb=	WorkbookFactory.create(f1);
  Sheet s1= wb.getSheet("LoginData");
     Row r1=s1.getRow(0);
   Cell c1 =r1.getCell(0);
   String username=  c1.getStringCellValue();
   
   System.out.println(username);
   
   String password=wb.getSheet("LoginData").getRow(0).getCell(1).getStringCellValue();
   System.out.println(password);
	
	
	
}    
    
}
