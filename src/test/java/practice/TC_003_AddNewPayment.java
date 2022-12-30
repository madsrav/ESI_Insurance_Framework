package practice;

import  org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_003_AddNewPayment {

	@Test
	public void addpayment()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/Life_Insurance_Management_System/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("555");
		driver.findElement(By.name("password")).sendKeys("666");
		driver.findElement(By.xpath("//button[text()='login']")).click();

		driver.findElement(By.xpath("//a[.='PAYMENTS']")).click();
		driver.findElement(By.xpath("//a[.='Add Payment']")).click();
		driver.findElement(By.name("recipt_no"));
		driver.findElement(By.name("client_id")).sendKeys("1671537626");
		driver.findElement(By.name("month")).sendKeys("august");
		driver.findElement(By.name("amount")).sendKeys("65000");
		driver.findElement(By.name("due")).sendKeys("15000");
		driver.findElement(By.name("fine")).sendKeys("500");
		driver.findElement(By.name("agent_id"));
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[.='PAYMENTS']")).click();
		
		String payment=driver.findElement(By.xpath("//td[.='1671537626']")).getText();
		
		Assert.assertTrue(payment.equals("1671537626"), payment+"is not added");
		
		driver.findElement(By.xpath("//div[@class='header-right']")).click();//logout
		
	}
}
