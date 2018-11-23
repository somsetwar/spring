package com.cts.training.controller;

import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.training.model.Employee;
import com.cts.training.model.EmployeeUtility;

@RequestMapping("/emp")
@Controller
public class EmployeeController {
	@Autowired
	private EmployeeUtility utility;
	@RequestMapping("/detail")
	public String getEmpDetails(Map<String, Object> model,
			@RequestParam("id") int id)
	{
		Employee e=utility.findEmployee(id);
		model.put("emp", e);
		return "showEmployee";
		
		
	}
}
