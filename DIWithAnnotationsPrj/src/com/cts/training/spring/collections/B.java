package com.cts.training.spring.collections;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class B {
	public B()
	{
		System.out.println("constructor of B");
	}

	@PostConstruct
	public void completed()
	{
		System.out.println("construction of B is completed");
	}
	@PreDestroy
	public void cleanup()
	{
		System.out.println("cleaning up resources of B");
	}
}
