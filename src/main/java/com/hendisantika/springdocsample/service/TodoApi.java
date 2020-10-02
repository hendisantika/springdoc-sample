package com.hendisantika.springdocsample.service;

import com.hendisantika.springdocsample.model.Todo;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springdoc-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/10/20
 * Time: 06.05
 */
@RequestMapping("/api/todos")
@Tag(name = "Todo API", description = "List Todo API")
@SecurityRequirement(name = "api")
public interface TodoApi {
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<Todo> findAll();

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    Todo findById(@PathVariable String id);

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    Todo save(@RequestBody Todo todo);

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    Todo update(@PathVariable String id, @RequestBody Todo todo);

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void delete(@PathVariable String id);
}
