package com.cts.test;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String location="Hinjewadi";
	private String city="Pune";
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
