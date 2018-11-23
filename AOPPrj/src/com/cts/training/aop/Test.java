package com.cts.training.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=
				new ClassPathXmlApplicationContext("beans.xml");
		Instrumentalist inst=(Instrumentalist)context.getBean("instrumentalist");
		inst.play();
		

	}

}
