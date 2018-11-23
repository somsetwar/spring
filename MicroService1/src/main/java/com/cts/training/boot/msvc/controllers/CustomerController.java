package com.cts.training.boot.msvc.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.boot.msvc.model.Customer;

@RestController
public class CustomerController {
	@GetMapping(value="/",produces=MediaType.APPLICATION_JSON_VALUE)
	public Customer getCustomer()
	{
		return new Customer(1001,"Rakesh");
	}

}
