package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_002_CreateNominee {
	@Test
	public void CreateNominee()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/Life_Insurance_Management_System/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("555");
		driver.findElement(By.name("password")).sendKeys("666");
		driver.findElement(By.xpath("//button[text()='login']")).click();

		driver.findElement(By.xpath("//a[.='NOMINEE']")).click();
		driver.findElement(By.xpath("//a[.='Add Nominee']")).click();
		driver.findElement(By.name("nominee_id"));
		driver.findElement(By.name("client_id")).sendKeys("1671537626");
		driver.findElement(By.name("name")).sendKeys("roopesh");
		driver.findElement(By.name("sex")).sendKeys("male");
		driver.findElement(By.name("birth_date")).sendKeys("02/02/1982");
		driver.findElement(By.name("nid")).sendKeys("155645656445455");
		driver.findElement(By.name("relationship")).sendKeys("father");
		driver.findElement(By.name("priority")).sendKeys("1st");
		driver.findElement(By.name("phone")).sendKeys("9856745896");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[.='NOMINEE']")).click();

		String nominee = driver.findElement(By.xpath("//td[.='roopesh']")).getText();
		if(nominee.equalsIgnoreCase("Roopesh"))
		{
			System.out.println("nominee added");
		}
		else
		{
			System.out.println("failed");
		}

		driver.findElement(By.xpath("//div[@class='header-right']")).click();//logout


	}

}
