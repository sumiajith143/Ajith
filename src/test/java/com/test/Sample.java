package com.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample {
	  public static void main(String[] args) {
		
		  Sample sample= new Sample();
		  sample.getSingleFlight();
		  sample.getListFlight();
		  sample.postCreateFlight();
		  sample.putUpdateFlight();
	}

	  public void getSingleFlight() {
	
	    RequestSpecification reqSpec;
		
		//1. intialize the Restassuredclass
		reqSpec = RestAssured.given();
		
		//2. add headrer,params,auth,req body
		reqSpec = reqSpec.header("Content-Type", "application/json");
		
		//3.Add path param
		reqSpec = reqSpec.pathParam("fNo", "1248");
		
		//4.  Method type(req type)
		Response response = reqSpec.get("https://omrbranch.com/api/flight/{fNo}");
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		String asString = response.asString();
		System.out.println(asString);
		
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
	}
//******************************
	  public void getListFlight() {

		  RequestSpecification reqSpec;
			
			//1. intialize the Restassuredclass
			reqSpec = RestAssured.given();
			
			//2. add headrer,params,auth,req body
			reqSpec = reqSpec.header("Content-Type", "application/json");
			
			//3.Add path param
			//reqSpec = reqSpec.pathParam("fNo", "1248");
			
			//4.  Method type(req type)
			Response response = reqSpec.get("https://omrbranch.com/api/flights?page=1");
			
			int statusCode = response.getStatusCode();
			System.out.println(statusCode);
			
			String asString = response.asString();
			System.out.println(asString);
			
			String asPrettyString = response.asPrettyString();
			System.out.println(asPrettyString);
		  
	}
	//******************************
	  public void postCreateFlight() {
		  

		  RequestSpecification reqSpec;
			
			//1. intialize the Restassuredclass
			reqSpec = RestAssured.given();
			
			//2. add headrer,params,auth,req body
			reqSpec = reqSpec.header("Content-Type", "application/json");
			
			//3.Add path param
			//reqSpec = reqSpec.pathParam("fNo", "1248");
			
			//3.1 add req body 
			reqSpec = reqSpec.body("{\r\n"
					+ "    \"flightName\": \"AirIndia\",\r\n"
					+ "    \"Country\": \"India\",\r\n"
					+ "    \"Destinations\": \"87\",\r\n"
					+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n"
					+ "}");
			
			//4.  Method type(req type)
			Response response = reqSpec.post("https://omrbranch.com/api/flights");
			
			int statusCode = response.getStatusCode();
			System.out.println(statusCode);
			
			String asString = response.asString();
			System.out.println(asString);
			
			String asPrettyString = response.asPrettyString();
			System.out.println(asPrettyString);

	}
	//******************************
	  public void putUpdateFlight() {
		  
		  RequestSpecification reqSpec;
			
			//1. intialize the Restassuredclass
			reqSpec = RestAssured.given();
			
			//2. add headrer,params,auth,req body
			reqSpec = reqSpec.header("Content-Type", "application/json");
			
			//3.Add path param
			//reqSpec = reqSpec.pathParam("fNo", "1491");
			
			//3.1 add req body 
			reqSpec = reqSpec.body("{\r\n"
					+ "    \"flightName\": \"AirIndia\",\r\n"
					+ "    \"Country\": \"India\",\r\n"
					+ "    \"Destinations\": 92,\r\n"
					+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n"
					+ "}");
			
			//4.  Method type(req type)
			Response response = reqSpec.put("https://omrbranch.com/api/flights");
			
			int statusCode = response.getStatusCode();
			System.out.println(statusCode);
			
			String asString = response.asString();
			System.out.println(asString);
			
			String asPrettyString = response.asPrettyString();
			System.out.println(asPrettyString);


	}
	//******************************
	  
	  
}