package com.flight;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.PojoClass1;
import com.pojo.PojoClass2;
import com.pojo.PojoClass3;



public class ListFlightPojo {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException  {

		File file = new File("C:\\Eclipse New\\Api\\src\\test\\resources");
		ObjectMapper mapper = new ObjectMapper();
		PojoClass1 pojoc2 = mapper.readValue(file, PojoClass1.class);

		int page = pojoc2.getPer_page();
		int perpage = pojoc2.getPer_page();
		int total = pojoc2.getTotal();
		int totalpages = pojoc2.getTotal_pages();

		System.out.println("page :" + page);
		System.out.println("per_page :" + perpage);
		System.out.println("total :" + total);
		System.out.println("total_pages :" + totalpages);

		ArrayList<PojoClass2> data = pojoc2.getData();
		for (PojoClass2 pc1data : data) {
			System.out.println("id :" + (pc1data.getId()));
			System.out.println("flightName :" + (pc1data.getFlightName()));
			System.out.println("country :" + (pc1data.getCountry()));
			System.out.println("destination :" + (pc1data.getDestinations()));
			System.out.println("url :" + (pc1data.getuRL()));
		}

		PojoClass3 support = pojoc2.getSupport();
		System.out.println("url :" + (support.getUrl()));
		System.out.println("text :" + (support.getText()));

	}

}