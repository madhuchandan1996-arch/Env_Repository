package testngprograms;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderProgram
{
 @DataProvider(name="data1")
 public Object method1()
 {
	 return new Object[][] {  {"Ram"},{"Laxman"},{"Shiva"} };
 }
 @Test(dataProvider="data1")
 public void testcase1(String students_name)
 {
	 System.out.println(students_name.concat(" is a good boy"));
	 Reporter.log(students_name.concat(" is a good boy"));
 }
}
