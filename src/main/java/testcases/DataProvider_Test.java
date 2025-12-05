package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProvider_Test {

	@DataProvider(name = "getData")
	public Object[][] getData() throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook w = WorkbookFactory.create(new FileInputStream("./src/main/resources/testdata/Data.xlsx"));

		int rowCount = w.getSheet("login").getPhysicalNumberOfRows();
		int columnCount = w.getSheet("login").getRow(0).getPhysicalNumberOfCells();

		Object[][] data = new Object[rowCount - 1][columnCount];

		for (int i = 1; i < rowCount; i++) { // skip row header

			Row row = w.getSheet("login").getRow(i);

			for (int j = 0; j < columnCount; j++) {
				Cell cell = row.getCell(j);
				data[i - 1][j] = cell.toString();
			}

		}
		System.out.println(Arrays.deepToString(data));
		return data;
	}

	@Test(dataProvider = "getData")
	public void createApplication(String name, String phone) {
		System.out.println(name);
		System.out.println(phone);

	}
	

}