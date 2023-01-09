package com.testng;


import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PreBase {
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("open browser");
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("login");
	}
	@Test
	public void createClient()

	{
		System.out.println("client is created");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");
	}
	
	
	@Test
	public void createNominee()

	{
		System.out.println("client is nominee");
	}
	
	@AfterClass
	public void closeBrowser()
	
	{
	System.out.println("close  browser");	
	}
	
}
