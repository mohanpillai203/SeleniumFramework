package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	
	
	public static void main(String[] args) {
		//getRowCount();
		//getColCount();
		//getCellDataString(0,0);
		//getCellDataNumber(1,1);
	}

	public static int getRowCount() {
		int rowCount = 0;

		try {
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows is: " + rowCount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace(System.out);
		}
		return rowCount;
	}
	
	public static int getColCount() {
		int colCount = 0;

		try {
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of Columns is: " + colCount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace(System.out);
		}
		return colCount;
	}

	public static String getCellDataString(int rowNum, int colNum) {
		String cellData = null;
		try {
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace(System.out);
		}
		return cellData;

	}
/*	
	public static double getCellDataNumber(int rowNum, int colNum) {
		double cellData1 = 0;
		try {
			cellData1 = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(cellData1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace(System.out);
		}
		return cellData1;

	}
*/
}
