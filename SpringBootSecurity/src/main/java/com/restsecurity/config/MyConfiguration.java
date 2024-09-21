package com.restsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.util.InMemoryResource;

@Configuration
public class MyConfiguration {
	
	
	// for user validation here 
	
	@Bean
	public UserDetailsService getUserDetailService() {
		
		InMemoryUserDetailsManager detailManager = new InMemoryUserDetailsManager();
		
	 UserDetails details=User.withUsername("Kiya")
			 .password("han123")
			 .roles("admin")
			 .build();
		
	 detailManager.createUser(details);
		return detailManager;
	}
	
	@Bean
	PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
		
	}
	

}
