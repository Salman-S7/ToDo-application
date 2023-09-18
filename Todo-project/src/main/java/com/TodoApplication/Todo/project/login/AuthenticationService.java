package com.TodoApplication.Todo.project.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String name, String password) {
		boolean isValidUserName = name.equalsIgnoreCase("salman");
		boolean isValidUserPassword = password.equals("dummy");
		return isValidUserName && isValidUserPassword;
	}
}
