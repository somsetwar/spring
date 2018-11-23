package com.cts.training.aopannotations;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
public class PlayPointcut {
	@Pointcut("execution(* com.cts.training.aopannotations.Instrumentalist.play())")
	public void sample()
	{
		
	}

}
