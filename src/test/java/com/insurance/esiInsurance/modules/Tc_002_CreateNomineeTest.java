package com.insurance.esiInsurance.modules;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.insurance.esiinsurance.generic.BaseClass;

import objectRepository.ClickAddNomineeButtonPage;
import objectRepository.EnterNomineeDetailsPage;
import objectRepository.HomePage;

public class Tc_002_CreateNomineeTest extends BaseClass {
	//webDriverUtils utils;
	//WebDriver driver;

	@Test
	public void CreateNominee() throws Exception
	{
//		driver = new ChromeDriver();
//		utils = new webDriverUtils(driver);
//		//reading details from propfile until login 
//		ReadDataPropFile dataPropFile=new ReadDataPropFile();
//		String url=dataPropFile.readDataPropFile("URL");
//		String un= dataPropFile.readDataPropFile("USERNAME");
//		String pwd=dataPropFile.readDataPropFile("PASSWORD");
//		utils.waitForPageLoad();//wait
//		utils.maximizewindow();//maximize webpage
//		driver.get(url);
//		LoginPage lp= new LoginPage(driver);//login
//		lp.Login(un, pwd);
        HomePage hp = new HomePage(driver);//click on nominee module
        hp.getNomineemodule().click();
		
    
      	ClickAddNomineeButtonPage canp= new ClickAddNomineeButtonPage(driver);
      	    canp.getAddNominee().click();
      	EnterNomineeDetailsPage cnp= new EnterNomineeDetailsPage(driver);
      	    cnp.createNominee();
      	    
      	  hp.getNomineemodule().click();
     // validation
		String nominee = driver.findElement(By.xpath("//td[.='roopesh']")).getText();
		if(nominee.equalsIgnoreCase("Roopesh"))
		{
			System.out.println("nominee added");
		}
		else
		{
			System.out.println("failed");
		}
//       hp.getLogout().click();
//       driver.close();

	}

}
