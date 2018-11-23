package com.cts.training.aopannotations;

import org.springframework.stereotype.Component;

@Component
public class Instrumentalist {
	public void play()
	{
		System.out.println("Playing the instrument");
	}

}
