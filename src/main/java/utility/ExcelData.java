package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelData {

	@DataProvider(name="SearchPowder")
	public static String[][] getdata()
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		Properties prop = new Properties();
		FileInputStream stream = new FileInputStream("./src/main/resources/source.properties");
		prop.load(stream);
		String sheetname=prop.getProperty("sheetname");
	//	System.out.println(sheetname);
		File f = new File("./ExcelData/ExcelData.xlsx");

		FileInputStream file = new FileInputStream(f);
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet(sheetname);

		int lastrow = sheet.getLastRowNum();
//		System.out.println(lastrow);
		Row rowcells = sheet.getRow(0);
		int lastcolumn = rowcells.getLastCellNum();
//		System.out.println(lastcolumn);

		DataFormatter format = new DataFormatter();

		String[][] str = new String[lastrow][lastcolumn];
		for (int i = 1; i <= lastrow; i++) {
			for (int j = 0; j < lastcolumn; j++) {
				str[i - 1][j] = format.formatCellValue(sheet.getRow(i).getCell(j));
		//		System.out.println(str[i - 1][j]);
			}
		}

		return str;

	}
	
}
