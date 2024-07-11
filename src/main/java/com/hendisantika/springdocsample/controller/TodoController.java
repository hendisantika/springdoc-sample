package com.hendisantika.springdocsample.controller;

import com.hendisantika.springdocsample.model.Todo;
import com.hendisantika.springdocsample.service.TodoApi;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 * Project : springdoc-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/10/20
 * Time: 06.08
 */
@RestController
public class TodoController implements TodoApi {
    private List<Todo> todos;

    @Override
    public List<Todo> findAll() {
        return todos;
    }

    @Override
    public Todo findById(String id) {
        return todos.stream().filter(todo -> todo.getId().equals(id)).findFirst().orElseGet(null);
    }

    @Override
    public Todo save(Todo todo) {
        todos.add(todo);
        return todo;
    }

    @Override
    public Todo update(String id, Todo todo) {
        for (Todo t : todos) {
            if (t.getId().equals(id)) {
                t.setText(todo.getText());
            }
        }

        return todo;
    }

    @Override
    public void delete(String id) {
        todos.removeIf(t -> t.getId().equals(id));
    }

    @PostConstruct
    public void onInit() {
        todos = Stream.of("Groceries", "Lisa's birthday")
                .map(todo -> new Todo(UUID.randomUUID().toString(), todo))
                .collect(Collectors.toList());
    }
}
