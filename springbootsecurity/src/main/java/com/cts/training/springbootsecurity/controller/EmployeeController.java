package com.cts.training.springbootsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.springbootsecurity.model.Employee;
import com.cts.training.springbootsecurity.model.EmployeeUtility;
import com.cts.training.springbootsecurity.model.Employees;

@RequestMapping("emp")
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeUtility utility;
	
	/*@RequestMapping(value="/detail",
			produces="application/xml",
			method=RequestMethod.GET)
	public Employee getEmployeeDetails()
	{
		return new Employee(101, "Akash", "Accountant");
	}*/
	
	@RequestMapping(produces= {"application/xml","application/json"},
			method=RequestMethod.GET)
	public ResponseEntity<Employees> getAllEmployees()
	{
		Employees employees= utility.getAllEmployees();
		return new ResponseEntity<Employees>(employees, HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}",produces= {MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE,MediaType.TEXT_PLAIN_VALUE},
			method=RequestMethod.GET)
	public ResponseEntity<?> getEmployee(@PathVariable("id") int id)
	{
		Employee employee= utility.findEmployee(id);
		if(employee==null) {
			ResponseEntity<String> entity=
					new ResponseEntity<>("No such employee",HttpStatus.BAD_REQUEST);
			return entity;
		}
		else {
			return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		}
	}
	
	@RequestMapping(consumes= {MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE},
			produces=MediaType.TEXT_PLAIN_VALUE,
			method=RequestMethod.POST)
	public ResponseEntity<String> addEmployee(@RequestBody Employee e)
	{
		String msg= utility.addEmployee(e);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/{id}",consumes= {MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE},
			produces=MediaType.TEXT_PLAIN_VALUE,
			method=RequestMethod.PUT)
	public ResponseEntity<String> updateEmployee(@PathVariable("id") int id,
			@RequestBody Employee e)
	{
		String msg= utility.updateEmployee(id, e);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}",
			produces=MediaType.TEXT_PLAIN_VALUE,
			method=RequestMethod.DELETE)
	public ResponseEntity<String> removeEmployee(@PathVariable("id") int id)
	{
		String msg= utility.removeEmployee(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
}
