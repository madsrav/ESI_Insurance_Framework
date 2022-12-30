package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Read_Data_From_Excel_singledata {
	@Test
	public void readdata() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("../SDET11_SRAVS/DATA/data.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		int value= (int) book.getSheet("Sheet1").getRow(7).getCell(2).getNumericCellValue();
		System.out.println(value);
		
	}

}
