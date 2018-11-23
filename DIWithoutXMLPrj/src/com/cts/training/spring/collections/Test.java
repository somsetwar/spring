package com.cts.training.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=
				new AnnotationConfigApplicationContext(new Class[] {
						BeanConfig.class,NextBeanConfig.class  
				});
		A a1=(A)context.getBean("a");
		
	}

}
