package com.insurance.esiInsurance.modules;

import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.insurance.esiinsurance.generic.BaseClass;
import com.insurance.esiinsurance.generic.ReadDataPropFile;
import com.insurance.esiinsurance.generic.webDriverUtils;

import objectRepository.EnterClientDetailsPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;

public class TC_006_EditClientTest extends BaseClass {
//	WebDriver driver;
	@Test
	public void editclient() throws Exception
	{
//		driver = new ChromeDriver();
//		webDriverUtils utils = new webDriverUtils(driver);
//
//		//extracting login data from property file
//		ReadDataPropFile dataPropFile= new ReadDataPropFile();
//		String url=dataPropFile.readDataPropFile("URL");
//		String un= dataPropFile.readDataPropFile("USERNAME");
//		String pwd= dataPropFile.readDataPropFile("PASSWORD");
//		driver.get(url);//getting url
//		utils.waitForPageLoad();// implicitwait
//		LoginPage lp = new LoginPage(driver);
//		lp.Login(un, pwd);
		
		
		HomePage hp= new HomePage(driver);//home page
		hp.getClientmodule().click();//click on client module
		EnterClientDetailsPage ccp = new EnterClientDetailsPage(driver);
		driver.findElement(By.xpath("//td[.='1672133737']/following-sibling::td/a[.='Edit']")).click();//clicking on edit button
		ccp.getAddress().clear(); //to clear the textbox
		ccp.getAddress().sendKeys("PUNJAGUTTA");//change the address
		ccp.getSubmit().click();//submit
		hp.getClientmodule().click();//again click on module button for validation

		String editclient= driver.findElement(By.xpath("//td[.='1672133737']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td")).getText();
		Assert.assertTrue(editclient.equals("PUNJAGUTTA"), editclient+"not edited");
		//hp.getLogout();
	//	utils.closeBrowser();
	}
}