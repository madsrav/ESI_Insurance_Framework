package com.insurance.esiInsurance.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.insurance.esiinsurance.generic.Read_Data_From_Excel;
import com.insurance.esiinsurance.generic.webDriverUtils;

import objectRepository.ClickAddClientButtonPage;
import objectRepository.EnterClientDetailsPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;

public class TC_001_CreateClientTest {
	WebDriver driver;
	webDriverUtils utils;
	@Test
	public void createclient() throws Throwable
	{
		driver = new ChromeDriver();
		utils = new webDriverUtils(driver);
		//reading data from excel file
		Read_Data_From_Excel read = new Read_Data_From_Excel();
		String url=read.readDataFromExcel("Sheet1",0,0);
		String un=read.readDataFromExcel("Sheet1",1,0);
		String pwd= read.readDataFromExcel("Sheet1",2,0);

		driver.get(url);
		utils.waitForPageLoad();//using webdriver utility methods
		utils.maximizewindow();//using webdriver utility methods
		LoginPage lpg= new LoginPage(driver);//by using pom class(login page)
		lpg.Login(un, pwd);

		HomePage hpc = new HomePage(driver);//object for access home page details
		hpc.getClientmodule().click(); //click on client module
		ClickAddClientButtonPage cabg = new ClickAddClientButtonPage(driver);//object for access click on add button
		cabg.getAddbutton().click();   //click on Add Client Button
		EnterClientDetailsPage ccg = new EnterClientDetailsPage(driver);//object for create client page details
		ccg.CreateClient();  //with this we can get all the details in the client page
		hpc.getClientmodule().click(); //click on client module

		// validation
		String clientid =  driver.findElement(By.xpath("//td[.='1671606923']")).getText();
		if(clientid.equalsIgnoreCase("1671606923"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		//for logout 
		hpc.getLogout();
		driver.close();

	}
}