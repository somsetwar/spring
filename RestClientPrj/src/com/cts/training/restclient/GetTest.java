package com.cts.training.restclient;

import org.springframework.web.client.RestTemplate;

public class GetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestTemplate template=new RestTemplate();
		String uri="http://localhost:8080/SpringRestPrj/rest/emp/101";
		Employee e=template.getForObject(uri, Employee.class);
		System.out.println("Name: "+e.getName());
		System.out.println("Designation: "+e.getDesignation());

	}

}
