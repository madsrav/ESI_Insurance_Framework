package com.insurance.esiinsurance.generic;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class ReadDataFromJson {
	public static void main(String args[]) throws Exception {
		//Creating a JSONParser object
		JSONParser jsonParser = new JSONParser();
		try {
			JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("./DATA/sample.json"));
			//Parsing the contents of the JSON file
			String Name = (String) jsonObject.get("name");
			String gend = (String) jsonObject.get("gender");
			String dob = (String) jsonObject.get("date of birth");
			String addres = (String) jsonObject.get("address");

			System.out.println("name :"+Name);
			System.out.println("gender: "+gend);
			System.out.println("Date of birth: "+dob);
			System.out.println("address:"+addres);
			System.out.println(" ");

		} 
		catch (IOException e)
		{
			e.printStackTrace();
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
	}
}