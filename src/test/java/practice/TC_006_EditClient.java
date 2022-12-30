package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_006_EditClient {
	WebDriver driver;
	public void editclient()
	{
		driver = new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/Life_Insurance_Management_System/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("555");
		driver.findElement(By.name("password")).sendKeys("666");
		driver.findElement(By.xpath("//button[text()='login']")).click();
		
		driver.findElement(By.xpath("//a[text()='CLIENTS']")).click();
		driver.findElement(By.xpath("//td[.='1671607044']/following-sibling::td/a[.='Edit']")).click();
		driver.findElement(By.name("address")).clear();
		driver.findElement(By.name("address")).sendKeys("punjagutta");
		driver.findElement(By.xpath("//input[@type='submit']")).click();//for saving
		
		
	}

}
