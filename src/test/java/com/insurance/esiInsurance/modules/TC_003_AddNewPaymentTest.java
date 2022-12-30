package com.insurance.esiInsurance.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.testng.Assert;
import org.testng.annotations.Test;

import com.insurance.esiinsurance.generic.ReadDataPropFile;
import com.insurance.esiinsurance.generic.webDriverUtils;

import objectRepository.ClickAddPaymentButton;
import objectRepository.EnterPaymentDetailsPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;

public class TC_003_AddNewPaymentTest {

	@Test
	public void addpayment() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		webDriverUtils utils = new webDriverUtils(driver);
		ReadDataPropFile dataPropFile = new ReadDataPropFile();
		String url= dataPropFile.readDataPropFile("URL");
		String un = dataPropFile.readDataPropFile("USERNAME");
		String pwd=dataPropFile.readDataPropFile("PASSWORD");
		
		driver.get(	url);
		utils.waitForPageLoad();
		LoginPage lp = new LoginPage(driver);
		lp.Login(un, pwd);
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
		hp.getLogout().click();
		driver.close();

	}
}
