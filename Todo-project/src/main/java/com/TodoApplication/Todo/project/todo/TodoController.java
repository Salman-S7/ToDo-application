package com.TodoApplication.Todo.project.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	private TodoService todoService;

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping("todos")
	public String getTodos(ModelMap map) {
		List<Todo> list = todoService.getTodos();
		map.addAttribute("todos", list);
		return "todos";
	}

	@RequestMapping(value = "todo", method = RequestMethod.GET)
	public String showTodoPage() {
		return "todo";
	}

	@RequestMapping(value = "todo", method = RequestMethod.POST)
	public String addTodo(@RequestParam String desc, ModelMap map) {
		todoService.addTodo((String) map.get("name"), desc, LocalDate.now().plusYears(1), false);
		return "redirect:todos";
	}

}
