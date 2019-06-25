package com.tts.TodoList.repository;

import org.springframework.data.repository.CrudRepository;
import org.thymeleaf.expression.Strings;

import com.tts.TodoList.TodoList;

public interface TodoRepository extends CrudRepository<TodoList, Strings>{

}
