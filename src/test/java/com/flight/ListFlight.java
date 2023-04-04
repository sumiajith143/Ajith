package com.flight;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ListFlight {
public static void main(String[] args) throws IOException, ParseException {
	
	//1. Mention the path of the json file
	FileReader filereader = new FileReader("C:\\Eclipse New\\Api\\src\\test\\resources");
			
	
	//2. Create the object for Jsonparser class
			JSONParser jsonparser = new JSONParser();
			
			//3. pass the JSON file To fetch value 
			
			Object obj = jsonparser.parse(filereader);
			System.out.println(obj);
			JSONObject jsonobject =(JSONObject)obj;
			Object object8 = jsonobject.get("page");
			System.out.println(object8);
			Object object9 = jsonobject.get("per_page");
			System.out.println(object9);
			Object object10 = jsonobject.get("total");
			System.out.println(object10);
			Object object11 = jsonobject.get("total_pages");
			System.out.println(object11);
			Object object = jsonobject.get("data");
			JSONArray array =(JSONArray)object;
			
			for (int i = 0; i < array.size(); i++) {
				Object object2 = array.get(i);
				JSONObject jsonobject1=(JSONObject) object2;
				Object object3 = jsonobject1.get("id");
				System.out.println(object3);
				Object object4 = jsonobject1.get("flightName");
				System.out.println(object4);
				Object object5 = jsonobject1.get("Country");
				System.out.println(object5);
				Object object6 = jsonobject1.get("Destinations");
				System.out.println(object6);
				Object object7 = jsonobject1.get("URL");
				System.out.println(object7);
			}
}
}