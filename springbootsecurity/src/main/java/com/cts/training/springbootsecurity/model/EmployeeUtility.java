package com.cts.training.springbootsecurity.model;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

@Component
public class EmployeeUtility {
	private TreeMap<Integer, Employee> list=new TreeMap<>();
	public EmployeeUtility()
	{
		list.put(101, new Employee(101, "Akash", "Accountant"));
		list.put(102, new Employee(102, "Rakesh", "Developer"));
		list.put(103, new Employee(103, "Deva", "Accountant"));
	}
	
	public Employee findEmployee(int id)
	{
		return list.get(id);
	}
	public Employees getAllEmployees()
	{
		List<Employee> empList=new ArrayList<>(list.values());
		Employees employees=new Employees();
		employees.setEmployee(empList);
		return employees;
	}
	public String addEmployee(Employee e)
	{
		int nextId=list.lastKey()+1;
		e.setEmpId(nextId);
		list.put(nextId, e);
		return "employee with id "+nextId+" successfully added";
	}
	
	public String updateEmployee(int id,Employee e)
	{
		Employee emp=list.get(id);
		emp.setName(e.getName());
		emp.setDesignation(e.getDesignation());
		return "employee with id "+id+" successfully updated";
	}
	
	public String removeEmployee(int id)
	{
		list.remove(id);
		return "employee with id "+id+" successfully removed";
	}
}
