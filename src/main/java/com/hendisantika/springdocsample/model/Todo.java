package com.hendisantika.springdocsample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : springdoc-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/10/20
 * Time: 06.02
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
class Todo {
    private String id;
    private String text;
}