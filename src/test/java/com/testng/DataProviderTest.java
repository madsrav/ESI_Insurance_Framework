package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "provideData")
	public void addClient(String clientname, String nomineename)
	{
		System.out.println(clientname+" "+nomineename);
	}
	@DataProvider
	public Object[][] provideData()
	{
		Object[][] objarray=new Object[2][2]; 
		
		objarray[0][0]="rajesh";
		objarray[0][1]="suman";
		
		objarray[1][0]="raju";
		objarray[1][1]="sum";
		return objarray;
	}

}
