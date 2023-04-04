package com.flight;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.FirstName;
import com.pojo.Flight1;
import com.pojo.Source;



public class Sample2 {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException  {
		
	

	File file = new File("C:\\Eclipse New\\Api\\src\\test\\resources\\Hello.json");

	ObjectMapper mapper = new ObjectMapper();

	List<FirstName> fli = new ArrayList<FirstName>();
	FirstName f1 = new FirstName(2, "Go First", "India", "92", "\"https:\\/\\/en.wikipedia.org\\/wiki\\/Go_First\"");
	FirstName f2 = new FirstName(3, "Indigo", "India", "38", "\"https:\\/\\/en.wikipedia.org\\/wiki\\/IndiGo\"");
	FirstName f3 = new FirstName(4, "SpiceJet", "India", "64", "\"https:\\/\\/en.wikipedia.org\\/wiki\\/SpiceJet\"");
	FirstName f4 = new FirstName(5, "Vistara", "India", "55", "\"https:\\/\\/en.wikipedia.org\\/wiki\\/Vistara\"");
	FirstName f5 = new FirstName(6, "JetAirways", "India", "46",
			"\"https:\\/\\/en.wikipedia.org\\/wiki\\/Jet_Airways\"");
	FirstName f6 = new FirstName(7, "AlaskaAirlines", "India", "27",
			"\"https:\\/\\/en.wikipedia.org\\/wiki\\/Alaska_Airlines\"");
	fli.add(f1);
	fli.add(f2);
	fli.add(f3);
	fli.add(f4);
	fli.add(f5);
	fli.add(f6);
	
	Source sor = new Source("\"https:\\/\\/www.omrbranch.com\"", "\"For Joining Automation Course, Please Contact-Velmurugan 9944152058\"");

	Flight1 f = new Flight1(1, 6, 29, 5, fli, sor);
	
	mapper.writeValue(file, f);
	}
}