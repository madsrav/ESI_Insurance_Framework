package com.insurance.esiinsurance.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Data_From_Excel {
	public String readDataFromExcel(String sheetName, int row, int cell) throws Exception
	{

		FileInputStream fis = new FileInputStream(I_AutoConstants.EXCELPATH);
	    DataFormatter df = new DataFormatter();
		Workbook book =	WorkbookFactory.create(fis);
		String value =df.formatCellValue(book.getSheet(sheetName).getRow(row).getCell(cell));
		return value ;
	
	}
	public String readDataFromExcel(String path,String sheetName, int row, int cell) throws Exception
	{

		FileInputStream fis = new FileInputStream(path);
		Workbook book =	WorkbookFactory.create(fis);
		String value =book.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return value ;

	}
}
