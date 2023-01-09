package com.insurance.esiInsurance.modules;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.insurance.esiinsurance.generic.BaseClass;

import objectRepository.ClickAddPaymentButton;
import objectRepository.EnterPaymentDetailsPage;
import objectRepository.HomePage;

@Listeners(com.insurance.esiinsurance.generic.ListenerImplementation.class)
public class Add_Edit_Delete_Payment_Test extends BaseClass
{
	@Test(groups = "smoke")
	public void addPayment() throws InterruptedException
	{
		HomePage hp= new HomePage(driver);
		hp.getPaymentsmodule().click();
		ClickAddPaymentButton capb = new ClickAddPaymentButton(driver);
		capb.getAddpayment().click();
		EnterPaymentDetailsPage epdg= new EnterPaymentDetailsPage(driver);
		epdg.paymentDetails();

		hp.getPaymentsmodule().click();//click again on payments module 
		//validation
		String payment=driver.findElement(By.xpath("//td[.='1671537626']")).getText();

		Assert.assertTrue(payment.equals("1671537626"), payment+"is not added");//validation
		Thread.sleep(3000);
	}
	@Test(groups="smoke")
	public void editpayment() 
	{
		driver.findElement(By.xpath("//a[.='PAYMENTS']")).click();
		driver.findElement(By.xpath("//td[.='1671607109_142126149']/../td/a")).click();
		driver.findElement(By.name("amount")).clear();
		driver.findElement(By.name("amount")).sendKeys("58000");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[.='PAYMENTS']")).click();

		String changepayment=driver.findElement(By.xpath("//td[.='1671607109_142126149']/following-sibling::td[3]")).getText();
		//System.out.println(changepayment);
		Assert.assertTrue(changepayment.equalsIgnoreCase("58000"), changepayment+"is not done");  
	}
	@Test(priority = 3,groups="smoke")
	public void deletePayment() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='PAYMENTS']")).click();
		try{
			driver.findElement(By.xpath("//td[.='1671602845_6821161777']/../td/a")).click();
			driver.findElement(By.xpath("//a[.='Delete Payment']")).click();
		}
		catch(Exception e)
		{
			System.out.println("VAl of "+e+"READ");
			System.out.println("Exception caught");
		}
	}
}