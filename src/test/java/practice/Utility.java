package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.insurance.esiinsurance.generic.I_AutoConstants;

public class Utility {


	public static void main(String[] args) throws Throwable {

		FileInputStream fis = new FileInputStream(I_AutoConstants.EXCELPATH);

		Workbook  book1=WorkbookFactory.create(fis);
		book1.createSheet("Sheet2").createRow(0).createCell(0).setCellValue("raja");
		FileOutputStream fos= new FileOutputStream(I_AutoConstants.EXCELPATH);
		book1.write(fos);
	}		 
}