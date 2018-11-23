package com.cts.training.spring.collections;

import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beansWithProperties.xml");
		Employee e=(Employee) context.getBean("emp");
		List<Address> addresses=e.getAddresses();
		for(Address address:addresses) {
			System.out.println(address.getLocation()+"\t"+address.getCity());
		}
		
		System.out.println("Remarks");
		Properties remarks=e.getRemarks();
		//remarks.list(System.out);
		Enumeration en=remarks.propertyNames();
		while(en.hasMoreElements()) {
			String propName=(String) en.nextElement();
			System.out.println(propName+"=="+remarks.getProperty(propName));
		}
	}

}
