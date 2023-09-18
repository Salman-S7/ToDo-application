package com.TodoApplication.Todo.project.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginServlet {
	@RequestMapping("login")
	public String login(@RequestParam String name, ModelMap map) {
		map.put("name", name);
		return "login";
	}
}
