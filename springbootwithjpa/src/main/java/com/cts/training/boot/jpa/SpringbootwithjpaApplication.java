package com.cts.training.boot.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.training.boot.jpa.domain.Employee;
import com.cts.training.boot.jpa.service.EmployeeService;

@SpringBootApplication
public class SpringbootwithjpaApplication implements CommandLineRunner {
	@Autowired
	private EmployeeService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwithjpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		service.initialize();
		/*Optional<Employee> opt=service.findEmployee(1001);
		if(opt.isPresent()) {
			Employee e=opt.get();
			System.out.println("Name: "+e.getEmpName());
			System.out.println("Designation: "+e.getDesignation());
		}
		else {
			System.out.println("No such employee");
		}*/
		System.out.println("command line args "+args[0]);
		List<Employee> employees=service.getByDesignation(args[0]);
		for(Employee employee:employees) {
			System.out.println(employee.getEmpId()+"\t"+employee.getEmpName());
		}
		
	}
}
