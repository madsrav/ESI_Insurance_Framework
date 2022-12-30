package com.insurance.Xml;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadDataFromJSONTest {
	@Test
	public void readDataFromJSON() throws Throwable
	{
		FileReader fr = new FileReader("./DATA/commondata.json");
		JSONParser jp = new JSONParser();
		Object jObj = jp.parse(fr);
		HashMap hp	=(HashMap)jObj;
		String url=(String) hp.get("URL");
		Object un=  hp.get("UN");
	    Object pwd=  hp.get("PWD");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
	}
}
