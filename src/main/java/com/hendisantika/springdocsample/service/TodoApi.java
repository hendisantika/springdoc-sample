package com.hendisantika.springdocsample.service;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
