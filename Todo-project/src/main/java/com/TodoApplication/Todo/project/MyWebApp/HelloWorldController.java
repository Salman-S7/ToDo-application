package com.TodoApplication.Todo.project.MyWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	@RequestMapping("hello")
	public String sayHello() {
		return "welcome";
	}

	@RequestMapping("hii")
	@ResponseBody
	public StringBuffer sayHii() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>");
		sb.append("Hiii");
		sb.append("</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>");
		sb.append("hiii we are here wirting html in java");
		sb.append("</h1>");
		sb.append("</body>");
		sb.append("</html>");

		return sb;
	}

	@RequestMapping("ss")
	public String sayHelloJsp() {
		return "welcome";
	}

}
///main/webapp/WEB-INF/jsp/ directory.
