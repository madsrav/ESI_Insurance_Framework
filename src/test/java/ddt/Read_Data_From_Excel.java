package ddt;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Read_Data_From_Excel {
	@Test
	public void readdatafromexcel() throws Exception
	{
		FileInputStream fis = new FileInputStream("../SDET11_SRAVS/DATA/data1.xlsx");
		Sheet sh =WorkbookFactory.create(fis).getSheet("Sheet1");
		
		
/*	DataFormatter df= new DataFormatter();
	for (int i = 0; i <=sh.getLastRowNum(); i++)
	{
		Row r= sh.getRow(i);
		System.out.println(i+" ");

		for (int j = 0; j <=r.getLastCellNum(); j++) 
		{
			String value = df.formatCellValue(r.getCell(j));
			System.out.println(value+" ");
		}
	}*/

		int rownumber=	sh.getLastRowNum();
		System.out.println(rownumber);

		for (int i = 0; i <=rownumber; i++) 
		{
		String data =	sh.getRow(i).getCell(0).getStringCellValue();
           System.out.println(data+" ");
		}

	}
}
