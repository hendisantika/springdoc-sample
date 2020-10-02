package com.hendisantika.springdocsample.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by IntelliJ IDEA.
 * Project : springdoc-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/10/20
 * Time: 05.57
 */
@EnableWebSecurity
class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/unsecured", "/swagger-ui/**", "/reflectoring-openapi/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .httpBasic();
    }
}
