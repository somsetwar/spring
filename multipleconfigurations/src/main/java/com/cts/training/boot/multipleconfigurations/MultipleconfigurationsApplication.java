package com.cts.training.boot.multipleconfigurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.cts.training.boot.model1.Customer;
import com.cts.training.boot.model2.Employee;

@SpringBootApplication
@ImportResource("testbeans.xml")
public class MultipleconfigurationsApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MultipleconfigurationsApplication.class, args);
	}
	@Autowired
	private Customer customer;
	
	@Autowired
	private Employee employee;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("customer details");
		System.out.println(customer.getCustomerId()+"\t"+customer.getCustomerName()+
				"\t"+customer.getBalance());
		
		System.out.println("employee details");
		System.out.println(employee.getId()+"\t"+employee.getName());
	}
	
	
	
}
