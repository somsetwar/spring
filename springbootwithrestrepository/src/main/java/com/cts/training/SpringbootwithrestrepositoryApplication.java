package com.cts.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.test.training.EmployeeRepository;

@SpringBootApplication(scanBasePackages= {"com.cts.training",
		"com.test.training"
		})

public class SpringbootwithrestrepositoryApplication {
	 @Autowired
	private EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwithrestrepositoryApplication.class, args);
	}
}
