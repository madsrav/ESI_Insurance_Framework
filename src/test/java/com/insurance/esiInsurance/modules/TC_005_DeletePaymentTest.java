package com.insurance.esiInsurance.modules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.insurance.esiinsurance.generic.BaseClass;
import com.insurance.esiinsurance.generic.ReadDataPropFile;

public class TC_005_DeletePaymentTest extends BaseClass{
	//	WebDriver driver;

	//		driver = new ChromeDriver();
	//		ReadDataPropFile read= new ReadDataPropFile();
	//		String url= read.readDataPropFile("URL");
	//		String un=read.readDataPropFile("USERNAME");
	//		String pwd=read.readDataPropFile("PASSWORD");
	//
	//		driver.get(url);
	//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//		driver.findElement(By.name("username")).sendKeys(un);
	//		driver.findElement(By.name("password")).sendKeys(pwd);
	//		driver.findElement(By.xpath("//button[text()='login']")).click();


	//driver.findElement(By.xpath("//div[@class='header-right']")).click();//logout
	//driver.close();

	@Test
	public void deletePayment()
	{
		driver.findElement(By.xpath("//a[.='PAYMENTS']")).click();
		try{
			driver.findElement(By.xpath("//td[.='1671602845_682116177']/../td/a")).click();
			driver.findElement(By.xpath("//a[.='Delete Payment']")).click();
		}
		catch(Exception e)
		{
			System.out.println("VAl of "+e+"READ");
			System.out.println("Exception caught");
		}

	}
}
