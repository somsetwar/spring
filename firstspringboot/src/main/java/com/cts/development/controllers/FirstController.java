package com.cts.development.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {
	@RequestMapping("/msg")
	public String getMessage()
	{
		return "<h2>Welcome to Spring Boot</h2>";
	}

}
