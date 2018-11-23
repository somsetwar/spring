package com.cts.training.boot.multipleconfigurations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cts.training.boot.model2.Employee;

@Configuration
public class MyConfig {
	
	@Bean
	public Employee getEmployee()
	{
		Employee e1=new Employee();
		e1.setId(1001);
		e1.setName("Akash");
		return e1;
	}

}
