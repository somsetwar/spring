package com.cts.training.aopannotations;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {
	@Before("com.cts.training.aopannotations.PlayPointcut.sample()")
	public void takeSeats()
	{
		System.out.println("audience taking seats");
	}
	@Before("com.cts.training.aopannotations.PlayPointcut.sample()")
	public void switchOffMobilePhones()
	{
		System.out.println("audience switching off mobile phones");
	}
	@AfterReturning("com.cts.training.aopannotations.PlayPointcut.sample()")
	public void applaud()
	{
		System.out.println("CLAP! CLAP!! CLAP!!!");
	}
}
