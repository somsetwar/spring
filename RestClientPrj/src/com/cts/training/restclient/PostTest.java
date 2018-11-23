package com.cts.training.restclient;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class PostTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestTemplate template=new RestTemplate();
		String uri="http://localhost:8080/SpringRestPrj/rest/emp";
		HttpHeaders headers=new HttpHeaders(); 
		headers.put("Content-Type", Arrays.asList(MediaType.APPLICATION_XML_VALUE));
		HttpEntity<String> entity=new HttpEntity<>(headers);
		Employee employee=new Employee();
		employee.setName("Arvind");
		employee.setDesignation("Accountant"); 
		String responseMsg=template.postForObject(uri, employee, String.class,entity);
		System.out.println(responseMsg);

	}

}
