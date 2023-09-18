package com.TodoApplication.Todo.project.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo(1, "salman", "participate in gsoc", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "salman", "win in gsoc", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(3, "salman", "earn money in gsoc", LocalDate.now().plusYears(2), false));
	}

	public List<Todo> getTodos() {
		return todos;
	}
}
