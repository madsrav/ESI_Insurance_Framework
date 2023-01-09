package com.insurance.esiInsurance.modules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.insurance.esiinsurance.generic.BaseClass;
import com.insurance.esiinsurance.generic.ReadDataPropFile;

public class TC_004_EditPaymentTest extends BaseClass {
	//WebDriver driver;
	@Test
	public void editpayment() throws Throwable
	{
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

		driver.findElement(By.xpath("//a[.='PAYMENTS']")).click();
		driver.findElement(By.xpath("//td[.='1671607109_142126149']/../td/a")).click();
		driver.findElement(By.name("amount")).clear();
		driver.findElement(By.name("amount")).sendKeys("58000");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[.='PAYMENTS']")).click();

		String changepayment=driver.findElement(By.xpath("//td[.='1671607109_142126149']/following-sibling::td[3]")).getText();
		System.out.println(changepayment);
		Assert.assertTrue(changepayment.equalsIgnoreCase("58000"), changepayment+"is not done");

		
//		driver.findElement(By.xpath("//div[@class='header-right']")).click();//logout
//		driver.close();
	}
}
