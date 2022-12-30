package com.insurance.Xml;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromXmlTest {
	@Test
	public void readDataFromXml(XmlTest xml)

	{
		String url=xml.getParameter("URL");
		System.out.println(url);
		
		String un=xml.getParameter("UN");
		System.out.println(un);
		
		String pwd=xml.getParameter("PWD");
		System.out.println(pwd);
	}
}
