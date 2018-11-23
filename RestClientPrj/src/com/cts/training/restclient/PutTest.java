package com.cts.training.restclient;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class PutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestTemplate template=new RestTemplate();
		String uri="http://localhost:8080/SpringRestPrj/rest/emp/101";
		HttpHeaders headers=new HttpHeaders();
		headers.put("Content-Type", Arrays.asList(MediaType.APPLICATION_XML_VALUE));
		
		Employee employee=new Employee();
		employee.setName("Deva");
		employee.setDesignation("Architect");
		HttpEntity<Employee> entity=new HttpEntity<>(employee,headers);
		ResponseEntity<String> responseMsg=
				template.exchange(uri,HttpMethod.PUT,entity,String.class);
		System.out.println("status code: "+responseMsg.getStatusCode());
		System.out.println("Response Body: "+responseMsg.getBody());

	}

}
