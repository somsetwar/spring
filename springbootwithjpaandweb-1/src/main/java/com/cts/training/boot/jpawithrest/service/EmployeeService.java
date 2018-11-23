package com.cts.training.boot.jpawithrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.boot.jpawithrest.model.Employee;
import com.cts.training.boot.jpawithrest.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	private int empSeq=106;
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
	
	@Transactional(propagation=Propagation.MANDATORY)
	public int addEmployee(Employee e)
	{
		e.setEmpId(empSeq);
		
		repository.save(e);
		
		return empSeq++;
	
	}
	public boolean updateEmployee(int id,Employee e)
	{
		Optional<Employee> opt=repository.findById(id);
		if(opt.isPresent()) {
			Employee emp=opt.get();
			emp.setName(e.getName());
			emp.setDesignation(e.getDesignation());
			return true;
		}
		else {
			return false;
		}
	}
	public boolean removeEmployee(int id)
	{
		Optional<Employee> opt=repository.findById(id);
		if(opt.isPresent()) {
			repository.delete(opt.get());
			return true;
		}
		else {
			return false;
		}
	}
	
}
