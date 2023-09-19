package com.TodoApplication.Todo.project.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCounter = 0;
	static {
		todos.add(new Todo(++todoCounter, "salman", "participate in gsoc", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCounter, "salman", "win in gsoc", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCounter, "salman", "earn money in gsoc", LocalDate.now().plusYears(2), false));
	}

	public List<Todo> getTodos() {
		return todos;
	}

	public void addTodo(String userName, String descrptoin, LocalDate targetDate, boolean done) {
		todos.add(new Todo(++todoCounter, userName, descrptoin, targetDate, done));
	}

	public void deleteById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}

	public Todo findById(int id) {
		// TODO Auto-generated method stub
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		deleteById(todo.getId());
		todos.add(todo);
	}
}
