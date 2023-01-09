package com.insurance.esiinsurance.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import objectRepository.HomePage;
import objectRepository.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public webDriverUtils utils;
	public static WebDriver sdriver;
	
	//@Parameters("browser")
	@BeforeClass(groups= {"smoke","regression"})
//	public void launchingBrowser(String browser)
//	{
	public void launchingBrowser()
	{
//	if(browser.equals("chrome"))
//
//		{
//		driver=new ChromeDriver();
//	}
//	else
//	{
//		driver =new FirefoxDriver();
	//
//		driver=new ChromeDriver();
	 //WebDriver driver;
    String propfile = System.getProperty("browser");
    System.out.println(propfile);
    if(propfile.equals("chrome"))
    {
       driver= new ChromeDriver();
    }
    else if(propfile.equals("edge"))
    {
   	 driver= new EdgeDriver();
    }
    else 
    {
   	 driver = new FirefoxDriver();
    }
    
  //  driver.get("http://rmgtestingserver/domain/Life_Insurance_Management_System/index.php");
		utils = new webDriverUtils(driver);
		utils.waitForPageLoad();
		utils.maximizewindow();	
		sdriver=driver;
	}

	@BeforeMethod(groups= {"smoke","regression"})
	public void login() throws Throwable
	{
		Read_Data_From_Excel read = new Read_Data_From_Excel();
		String url=read.readDataFromExcel("Sheet1",0,0);
		String un=read.readDataFromExcel("Sheet1",1,0);
		String pwd= read.readDataFromExcel("Sheet1",2,0);
		driver.get(url);
		LoginPage lp = new LoginPage(driver);
		lp.Login(un, pwd);
	}
	
	@AfterMethod(groups= {"smoke","regression"})
	public void Logout()
	{
		HomePage hp =new HomePage(driver);
		hp.getLogout().click();
	}
	
	@AfterClass(groups= {"smoke","regression"})
	public void closingBrowser()
	{
		driver.close();
	}
}
