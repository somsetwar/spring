package com.cts.training.spring.collections;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
	@Autowired
	private B b;

	public A()
	{
		System.out.println("constructor of A");
	}
	
	@PostConstruct
	public void completed()
	{
		System.out.println("initialization of A is completed");
	}
	@PreDestroy
	public void cleanUp()
	{
		System.out.println("cleaning up the resources of A");
	}
}
