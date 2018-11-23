package com.cts.training.boot.userproperties.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.boot.userproperties.model.MyProperties;

@RestController
public class PropertiesController {
@Autowired
private MyProperties myProperties;

@GetMapping(value="/properties",produces="text/html")
public String getProperties()
{
	String resp="<html><body><h4>";
	resp+="Host Name: "+myProperties.getServer().getName();
	resp+="<br>IP Address: "+myProperties.getIp().getAddress();
	resp+="<br>City: "+myProperties.getCity();
	resp+="</h4></body></html>";
	return resp;
}
}
