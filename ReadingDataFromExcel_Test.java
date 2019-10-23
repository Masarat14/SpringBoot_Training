package SeleniumTraining;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDataFromExcel_Test {

	public static void main(String[] args) throws IOException {
		
		 WebDriver driver;
		 
			System.setProperty("webdriver.chrome.driver","E:\\backup\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.newtours.demoaut.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
 
 			FileInputStream ip = new FileInputStream("C:\\Users\\munnisa\\Desktop\\Readdata.xlsx");
 			XSSFWorkbook wb = new XSSFWorkbook(ip);
 			XSSFSheet sheet = wb.getSheet("Sheet1");
 			int rc = sheet.getLastRowNum();
 			int cc = sheet.getRow(0).getLastCellNum();
 			
 			for (int i = 0; i< rc; i++)
 			{
 				XSSFRow currentrow = sheet.getRow(i);
 				String FIRST_NAME = currentrow.getCell(0).getStringCellValue();
 				String LASTNAME = currentrow.getCell(1).getStringCellValue();
 				String PHONE = currentrow.getCell(2).getStringCellValue();
 				String EMAIL = currentrow.getCell(3).getStringCellValue();
 				String ADDRESS = currentrow.getCell(4).getStringCellValue();
 				String CITY = currentrow.getCell(5).getStringCellValue();
 				String STATE = currentrow.getCell(6).getStringCellValue();
 				String POSTALCODE = currentrow.getCell(7).getStringCellValue();
 				String COUNTRY = currentrow.getCell(8).getStringCellValue();
 				String USERNAME = currentrow.getCell(9).getStringCellValue();
 				String PASSWORD = currentrow.getCell(10).getStringCellValue();
 				String CONFIRM = currentrow.getCell(11).getStringCellValue();
 				
 				
 				
 			}
 			
 			//Registration Process
 			
 			driver.findElement(By.linkText("REGISTER")).click();
 			
 			
			//ContactInformation
 			//driver.findElement(By.name("firstname")).sendKeys(FIRST_NAME);
 			
 			
			//driver.findElement(By.name("lastName")).sendKeys(LASTNAME);
 			
 			
 			
 			
 			
 
	}

}
