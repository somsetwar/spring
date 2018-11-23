package com.cts.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee e=(Employee) context.getBean("emp");
		System.out.println(e.getEmpId()+"\t"+e.getName()+"\t"+e.getDesignation());
		System.out.println(e.getAddress().getLocation()+"\t"+e.getAddress().getCity());

	}

}
