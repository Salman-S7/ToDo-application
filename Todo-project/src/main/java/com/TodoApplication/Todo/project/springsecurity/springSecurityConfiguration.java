package com.TodoApplication.Todo.project.springsecurity;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class springSecurityConfiguration {

	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {

		UserDetails userDetails1 = createNewUser("salman", "dummy");
		UserDetails userDetails2 = createNewUser("dummy1", "dummy1");

		return new InMemoryUserDetailsManager(userDetails1, userDetails2);

	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	private UserDetails createNewUser(String userName, String password) {
		Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);

		UserDetails userDetails = User.builder().passwordEncoder(passwordEncoder).username(userName).password(password)
				.roles("USER", "ADMIN").build();
		return userDetails;
	}

}
