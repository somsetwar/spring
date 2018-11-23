package com.cts.training.springbootsecurity.config;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@EnableGlobalAuthentication
public class DataBaseAuthConfiguration extends GlobalAuthenticationConfigurerAdapter {
	
	@Bean
	public UserDetailsService userDetailsService(JdbcTemplate template)
	{
		RowMapper<User> userRowMapper= new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new User(
						rs.getString("account_name"),
								rs.getString("password"),
								true,
								true,true,true,
								AuthorityUtils.createAuthorityList("ROLE_USER","ROLE_ADMIN"));
								
						
						
			}
		};
		return new UserDetailsService() {
			
			@Override
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				// TODO Auto-generated method stub
				String sql="select * from account where account_name=?";
				return template.queryForObject(sql, userRowMapper,username);
			}
		};
		
				
	}
	@Autowired
	private UserDetailsService userDetailsService;
	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(userDetailsService);
	}

}
