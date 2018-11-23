package com.cts.training.boot.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.boot.jpa.domain.Employee;
import com.cts.training.boot.jpa.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	
	public void initialize()
	{
		repository.save(new Employee(1001, "Rajiv", "Accountant"));
		repository.save(new Employee(1002, "Akash", "Developer"));
		repository.save(new Employee(1003, "Deva", "Team Lead"));
		repository.save(new Employee(1004, "Ajay", "Accountant"));
		repository.save(new Employee(1005, "Sujay", "Developer"));
	}
	
	public Optional<Employee> findEmployee(int id)
	{
		return repository.findById(id);
	}
	
	public List<Employee> getAllEmployees()
	{
		return repository.findAll();
	}
	
	public List<Employee> getByDesignation(String designation)
	{
		return repository.findEmployeeByDesignation(designation);
	}
	
}
