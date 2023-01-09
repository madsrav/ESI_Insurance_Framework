package com.testng;

import org.testng.annotations.Test;

public class Enabled {
	
	//here in this condition we need to make priority that doesn't have any conditions
	//if we want to make any method false enabling and another method depends on this method, first make the priority to run no conditions method
	
	@Test(enabled = false)
	public void addClient()
	{
		System.out.println("add client done");
	}

	@Test
	public void add()
	{
		System.out.println("add nominee done");
	}

	@Test(dependsOnMethods = "addClient")
	public void addpayment()
	{
		System.out.println("add payment done");
	}


}
