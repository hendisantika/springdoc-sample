package com.hendisantika.springdocsample.controller;

import com.hendisantika.springdocsample.model.Todo;
import com.hendisantika.springdocsample.service.TodoApi;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
