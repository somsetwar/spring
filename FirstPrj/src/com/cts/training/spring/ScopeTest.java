package com.cts.training.spring;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee emp1=(Employee) context.getBean("emp");
		Employee emp2=(Employee) context.getBean("emp");
		System.out.println(emp1==emp2);

	}

}
