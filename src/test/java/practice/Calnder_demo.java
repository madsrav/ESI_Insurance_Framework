package practice;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calnder_demo {
	@Test
	public void calender() throws Exception
	{

		Date d = new Date();
		String dateandtime=	d.toString();
		String a[]= dateandtime.split(" ");
		
		System.out.println(dateandtime);
		
	   String day=a[0];
		String month=a[1];
		String date=a[2];
		String year=a[5];
		String currentdate = day+" "+month+" "+date+" "+year;
		System.out.println(currentdate);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
		//driver.findElement(By.xpath("//div[@aria-label='"+day+" "+month+" "+date+" "+year+"']")).click();
	  //  driver.findElement(By.xpath("//div[@aria-label='"+day+" "+month+" "+date+" "+year+"']")).click();
       driver.findElement(By.xpath("//div[@aria-label='"+currentdate+"']")).click();
       
	}
}
