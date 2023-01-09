package com.testng;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 3)
	public void addClient()
	{
		System.out.println("add client done");
	}

	@Test(invocationCount = 1)
	public void addNominee()
	{
		System.out.println("add nominee done");
	}

	@Test(invocationCount = 2)
	public void addpayment()
	{
		System.out.println("add payment done");
	}


}
