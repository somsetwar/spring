package com.cts.training.restclient;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class DeleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestTemplate template=new RestTemplate();
		String uri="http://localhost:8080/SpringRestPrj/rest/emp/102";
		HttpHeaders headers=new HttpHeaders();
		HttpEntity<String> entity=new HttpEntity<>("",headers); 
		ResponseEntity<String> responseMsg=
				template.exchange(uri,HttpMethod.DELETE,entity,String.class);
		System.out.println("status code: "+responseMsg.getStatusCode());
		System.out.println("Response Body: "+responseMsg.getBody());

	}

}
