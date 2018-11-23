package com.cts.training.springbootsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping(value="/test",produces="text/html")
	public String getContent()
	{
		return "<html><body><h2>security test</h2></body></html>";
	}
	
}
