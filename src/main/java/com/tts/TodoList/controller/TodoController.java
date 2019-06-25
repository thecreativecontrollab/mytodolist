package com.tts.TodoList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.TodoList.TodoList;
import com.tts.TodoList.repository.TodoRepository;

@Controller
public class TodoController {

	@Autowired
	private TodoRepository todoRepository;

	@GetMapping("/")
	public String index(TodoList todoList) {
		return "todolist/index";
	}

	private TodoList todoList;
	@PostMapping(value = "/")
	public String addNewTodo(TodoList todoList, Model model) {
		todoRepository.save(new TodoList(todoList.getTitle(), todoList.getAuthor(), todoList.getTodoList()));
		model.addAttribute("title", todoList.getTitle());
		model.addAttribute("author", todoList.getAuthor());
		model.addAttribute("todoList", todoList.getTodoList());
		return "todolist/result";
	}

}




