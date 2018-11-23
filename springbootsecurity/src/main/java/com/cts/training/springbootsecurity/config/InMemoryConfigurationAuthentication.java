package com.cts.training.springbootsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/*@Configuration
@EnableGlobalAuthentication*/
public class InMemoryConfigurationAuthentication {
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception
	{
		builder.inMemoryAuthentication()
		//.passwordEncoder( NoOpPasswordEncoder.getInstance())
		.withUser("userx").
		password("{noop}passx").
		roles("USER")
		.and()
		.withUser("usery").password("{noop}passy")
		.roles("USER");
	}

}
