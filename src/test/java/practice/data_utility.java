package practice;

import java.io.FileInputStream;
import java.util.Properties;

public class data_utility {
	
 public String getDataFromProperties(String data) throws Exception
 {
		FileInputStream fis= new FileInputStream("../SDET11_SRAVS/DATA/PROJECTCREDENTIALS.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		return pobj.getProperty(data);
 }

}
