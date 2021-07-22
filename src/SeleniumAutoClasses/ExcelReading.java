package SeleniumAutoClasses;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReading {
	
	public static void main(String[] args) throws IOException {
		
		
		Workbook wb = new XSSFWorkbook("C:\\Users\\talar\\Desktop\\TestCases.xlsx");
		Sheet sheet = wb.getSheetAt(0);
		int rowSize = sheet.getLastRowNum()+1;
		
		for(int i=0;i<rowSize;i++) {
			int cellCount = sheet.getRow(i).getLastCellNum();
			for(int j=0;j<cellCount;j++) {
				Cell cell = sheet.getRow(i).getCell(j);
				System.out.println(cell.getStringCellValue());
			}
			
		}
		
		
			
		
		
	}


}
