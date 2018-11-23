package com.cts.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee employee=(Employee)context.getBean("emp");
		System.out.println("Id: "+employee.getEmpId());
		System.out.println("Name: "+employee.getName());
		System.out.println("Designation: "+employee.getDesignation());
		Address address=employee.getAddress();
		System.out.println("Location: "+address.getLocation());
		System.out.println("City:"+address.getCity());

	}

}
