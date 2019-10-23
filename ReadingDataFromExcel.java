package SeleniumTraining;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream ip = new FileInputStream("C:\\Users\\munnisa\\Desktop\\Readdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rc= sheet.getLastRowNum();
		int cc = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i<rc; i++)
		{
			XSSFRow currentRow = sheet.getRow(i);
			for (int j= 0;j<cc;j++)
			{
				String value = currentRow.getCell(j).toString();
				System.out.print("    " + value);
				
			}
		System.out.println();
		}
		
		
		
		
		

	}

}
