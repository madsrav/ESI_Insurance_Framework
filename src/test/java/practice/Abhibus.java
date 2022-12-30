package practice;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {

	public static void main(String[] args) throws Exception {
		Date d = new Date();
		String dateandtime = d.toString();
		String a[]= dateandtime.split(" ");
		//Wed Dec 21 21:22:55 IST 2022  current date format
		//  0   1  2     3      4    5
		/*String a[] = dateandtime.split(" ");
		Calendar cal=  Calendar.getInstance();
		cal.add( Calendar.MONTH, -6);
		Date d1= cal.getTime();
		System.out.println(d1);*/
		
	

	//	int year=d1.getYear();
		//System.out.println(year);
		String date=a[2];
		String year=a[5];
		Format f = new SimpleDateFormat("EEEE "+"MM"+"YYYY");
		String str=f.format(new Date());
		System.out.println(str);


		SimpleDateFormat sf = new SimpleDateFormat("MMMM");
		String strmonth = sf.format(date);
		System.out.println(strmonth);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.abhibus.com");
		driver.findElement(By.xpath("(//div[@class='row align-items-center justify-content-start no-gutters'])[3]")).click();
		driver.findElement(By.xpath("//span[.='"+year+"']")).click();
		driver.findElement(By.xpath("//span[.='"+strmonth+"']")).click();
		driver.findElement(By.xpath("//a[.='"+date+"']")).click();

	}

}
