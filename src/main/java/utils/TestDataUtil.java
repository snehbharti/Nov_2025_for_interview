package utils;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDataUtil {

    // Read data from an Excel file
    public List<String[]> readExcelData(String filePath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        List<String[]> data = new ArrayList<>();
        for (Row row : sheet) {
            int cellCount = row.getPhysicalNumberOfCells();
            String[] rowData = new String[cellCount];
            for (int i = 0; i < cellCount; i++) {
                Cell cell = row.getCell(i);
                rowData[i] = cell.getStringCellValue();
            }
            data.add(rowData);
        }
        workbook.close();
        return data;
    }
}
