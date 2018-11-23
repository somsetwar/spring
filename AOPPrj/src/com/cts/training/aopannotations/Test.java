package com.cts.training.aopannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=
				new ClassPathXmlApplicationContext("aopWithAnnotations.xml");
		Instrumentalist inst=(Instrumentalist)context.getBean("instrumentalist");
		inst.play();
		

	}

}
