package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample {
    @Test
	public static void samplerun() {
		
         WebDriver driver;
         String propfile = System.getProperty("browser");
         System.out.println(propfile);
         if(propfile.equals("chrome"))
         {
            driver= new ChromeDriver();
         }
         else if(propfile.equals("edge"))
         {
        	 driver= new EdgeDriver();
         }
         else 
         {
        	 driver = new FirefoxDriver();
         }
         
         driver.get("https://www.google.com/");
	}

}

