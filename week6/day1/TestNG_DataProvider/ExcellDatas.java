package week6.day1.TestNG_DataProvider;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellDatas {

	public static String[][] inputData(String filename) throws IOException {
		
		XSSFWorkbook wb= new XSSFWorkbook("TestData/"+filename+".xlsx");
		XSSFSheet ws = wb.getSheetAt(0);
		int rowCount = ws.getLastRowNum();
		short columnCount = ws.getRow(0).getLastCellNum();
		String [][] data = new String[rowCount][columnCount];
		for (int i = 1; i <=rowCount; i++) {
			
			XSSFRow row = ws.getRow(i);
			
			for (int j = 0; j <columnCount; j++) {
				  
				XSSFCell cell = row.getCell(j);
				data[i-1][j] =cell.getStringCellValue();
				
			}
		wb.close();	
		}
		return data;

	}

}
