package com.TodoApplication.Todo.project.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

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
		List<Todo> list = todoService.getTodosByUserName(getLoggedInUserName(map));
		map.addAttribute("todos", list);
		return "todos";
	}

	@RequestMapping(value = "todo", method = RequestMethod.GET)
	public String showTodoPage(ModelMap map) {
		Todo todo = new Todo(0, getLoggedInUserName(map), "", LocalDate.now().plusYears(1), false);
		map.put("todo", todo);
		return "todo";
	}

	@RequestMapping(value = "todo", method = RequestMethod.POST)
	public String addTodo(ModelMap map, @Valid Todo todo, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "todo";
		}
		System.out.println(todo.getTargetDate());
		todoService.addTodo(getLoggedInUserName(map), todo.getDescription(), todo.getTargetDate(), false);
		return "redirect:todos";
	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deleteTodo(@RequestParam int id) {
		todoService.deleteById(id);
		return "redirect:todos";
	}

	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String showUpdateToDo(@RequestParam int id, ModelMap map) {
		Todo todo = todoService.findById(id);
		map.addAttribute("todo", todo);
		return "todo";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateTodo(ModelMap map, @Valid Todo todo, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "todo";
		}
		String name = getLoggedInUserName(map);
		todo.setUsername(name);
		todoService.updateTodo(todo);
		return "redirect:todos";
	}

	private String getLoggedInUserName(ModelMap map) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
}
