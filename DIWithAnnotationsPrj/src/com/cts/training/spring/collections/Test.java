package com.cts.training.spring.collections;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beansWithCollections.xml");
		Employee e=(Employee) context.getBean("emp");
		System.out.println(e.getEmpId()+"\t"+e.getName()+"\t"+e.getDesignation());
		List<Address> addresses=e.getAddresses();
		for(Address address:addresses)
		{
			System.out.println(address.getLocation()+"\t"+address.getCity());
		}
		
		System.out.println("accessing the address bean independently");
		Address a=(Address) context.getBean("address3");
		System.out.println(a.getLocation()+"\t"+a.getCity());

	}

}
