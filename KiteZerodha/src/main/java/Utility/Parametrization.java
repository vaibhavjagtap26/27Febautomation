package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	public static String getdata  ( int row, int cell ) throws EncryptedDocumentException, IOException  {
		FileInputStream file = new FileInputStream("E:\\java\\KiteZerodha\\src\\test\\resources\\practicepage.xlsx");
		String value = WorkbookFactory.create(file).getSheet("practicepage").getRow(row).getCell(cell).getStringCellValue();
		return value;
}
}
