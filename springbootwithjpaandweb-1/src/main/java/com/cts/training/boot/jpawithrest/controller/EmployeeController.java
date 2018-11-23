package com.cts.training.boot.jpawithrest.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.boot.jpawithrest.model.Employee;
import com.cts.training.boot.jpawithrest.service.EmployeeService;

@RequestMapping("emp")
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	
	
	@RequestMapping(produces= "application/json",
			method=RequestMethod.GET)
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		
		return new ResponseEntity<List<Employee>>(service.getAllEmployees(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}",produces= {MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE,MediaType.TEXT_PLAIN_VALUE},
			method=RequestMethod.GET)
	public ResponseEntity<?> getEmployee(@PathVariable("id") int id)
	{
		Optional<Employee> opt= service.findEmployee(id);
		if(!opt.isPresent()) {
			ResponseEntity<String> entity=
					new ResponseEntity<>("No such employee",HttpStatus.BAD_REQUEST);
			return entity;
		}
		else {
			return new ResponseEntity<Employee>(opt.get(),HttpStatus.OK);
		}
	}
	
	@RequestMapping(consumes= {MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE},
			produces=MediaType.TEXT_PLAIN_VALUE,
			method=RequestMethod.POST)
	public ResponseEntity<String> addEmployee(@RequestBody Employee e)
	{
		int addedId=service.addEmployee(e);
		String msg="Employee with id "+addedId+" added successfully";
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/{id}",consumes= {MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE},
			produces=MediaType.TEXT_PLAIN_VALUE,
			method=RequestMethod.PUT)
	public ResponseEntity<String> updateEmployee(@PathVariable("id") int id,
			@RequestBody Employee e)
	{
		boolean updated= service.updateEmployee(id, e);
		if(updated) {
			String msg="Employee with id "+id+" updated successfully";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		else {
			String msg="No such employee with the id "+id;
			return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@RequestMapping(value="/{id}",
			produces=MediaType.TEXT_PLAIN_VALUE,
			method=RequestMethod.DELETE)
	public ResponseEntity<String> removeEmployee(@PathVariable("id") int id)
	{
		boolean removed= service.removeEmployee(id);
		if(removed) {
			String msg="Employee with id "+id+" removed successfully";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		else {
			String msg="No such employee with the id "+id;
			return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		}
	}
	
	/*@PostConstruct
	public void init()
	{
		System.out.println("inserting the rows");
		service.initialize();
	}*/
}
