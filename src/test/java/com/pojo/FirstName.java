package com.pojo;

public class FirstName {
	private int id;
	private String flightName;
	private String country;
	private String destinations;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setDestinations(String destinations) {
		this.destinations = destinations;
	}
	public void setuRL(String uRL) {
		this.uRL = uRL;
	}
	
	public FirstName(int id, String flightName, String country, String destinations, String uRL) {
		super();
		this.id = id;
		this.flightName = flightName;
		this.country = country;
		this.destinations = destinations;
		this.uRL = uRL;
	}
	public int getId() {
		return id;
	}
	public String getFlightName() {
		return flightName;
	}
	public String getCountry() {
		return country;
	}
	public String getDestinations() {
		return destinations;
	}
	public String getuRL() {
		return uRL;
	}
	private String uRL;
}