package com.insurance.esiInsurance.modules;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.insurance.esiinsurance.generic.BaseClass;

import objectRepository.ClickAddClientButtonPage;
import objectRepository.EnterClientDetailsPage;
import objectRepository.HomePage;
@Listeners(com.insurance.esiinsurance.generic.ListenerImplementation.class)
public class Create_And_Edit_Client_Test extends BaseClass {
	
	@Test(groups = "regression")
	public void createclient() throws Throwable
	{
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

}
	
	@Test(groups = "regression")
	public void editClient() {
		
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
	}
	
}
