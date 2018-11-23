package com.cts.training.model;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

@Component
public class EmployeeUtility {
	private Map<Integer, Employee> list=new TreeMap<>();
	
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
}
