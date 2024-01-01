package week6;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb =new XSSFWorkbook("TestData/CreateLead.xlsx");
		XSSFSheet ws = wb.getSheetAt(0);
		int rowCount = ws.getLastRowNum();
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			short columnCount = row.getLastCellNum();
			for(int j=0;j<columnCount;j++) {
				XSSFCell cell = row.getCell(j);

				String cellvalue = cell.getStringCellValue();
				System.out.println(cellvalue);
				wb.close();

			}
		}
	}

}


