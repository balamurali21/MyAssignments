package week6.day1.TestNG_DataProvider;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcell {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook("TestData/CreateLead.xlsx");
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(1);
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);
		int rowCount = sheet.getLastRowNum();
		
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow rowLoop = sheet.getRow(i);
			short cellCount = rowLoop.getLastCellNum();
			
			for (int j = 0; j <cellCount; j++) {
				XSSFCell cellLoop = rowLoop.getCell(j);
				String ccellValue = cellLoop.getStringCellValue();
				System.out.println(ccellValue);
				workbook.close();
			}
			
			
		}
	}

}
