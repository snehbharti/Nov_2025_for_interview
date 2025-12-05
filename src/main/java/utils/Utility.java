package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	public Object[][] getExcelData(String filePath, String sheetName) {
		Object[][] data = null;
		try (FileInputStream fis = new FileInputStream(filePath); Workbook workbook = WorkbookFactory.create(fis)) {
			// Try-with-resources use nahi karoge to memory leak ho sakta hai
			Sheet sheet = workbook.getSheet(sheetName);
			int rowCount = sheet.getPhysicalNumberOfRows();
			int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			data = new Object[rowCount - 1][colCount];
			for (int i = 1; i < rowCount; i++) { // Skip header
				Row row = sheet.getRow(i);
				for (int j = 0; j < colCount; j++) {
					Cell cell = row.getCell(j);
					if (cell == null) { // to avoid Null pointer exception
						data[i - 1][j] = "";
					} else {
						data[i - 1][j] = cell.toString();
					}
				}
			}
		} catch (

		Exception e) {
			e.printStackTrace();
		}

		return data;
	}
}