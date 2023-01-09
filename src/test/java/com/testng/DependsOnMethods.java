package com.testng;

import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	public void addClient()
	{
		System.out.println("add client done");
	}

	
	@Test(dependsOnMethods = "addClient")
	public void addpayment()
	{
		System.out.println("add payment done");
	}
	
	@Test(dependsOnMethods = "addClient")
	public void addNominee()
	{
		System.out.println("add nominee done");
	}



}
