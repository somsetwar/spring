package com.cts.training.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beansWithCollections.xml");
	A a1=(A)context.getBean("a");
	
	
}
}
