package com.testng;

import org.testng.annotations.Test;

public class Demo1_Priority {
	
	@Test(priority = 1)
	public void addClient()
	{
		System.out.println("add client done");
	}

	@Test(priority = 0)
	public void addNominee()
	{
		System.out.println("add nominee done");
	}

	@Test(priority = 2)
	public void addpayment()
	{
		System.out.println("add payment done");
	}

}
