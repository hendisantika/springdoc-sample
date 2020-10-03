package com.hendisantika.springdocsample.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

/**
 * Created by IntelliJ IDEA.
 * Project : springdoc-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/10/20
 * Time: 06.03
 */
@OpenAPIDefinition(
        info = @Info(
                title = "Code-First Approach",
                description = "Spring Doc Sample",
                contact = @Contact(name = "Hendi Santika", url = "https://linktr.ee/hendisantika", email =
                        "hendisantika@yahoo.co.id"),
                license = @License(name = "MIT Licence", url = "https://github.com/hendisantika")),
        servers = @Server(url = "http://localhost:8080")
)
@SecurityScheme(name = "api", scheme = "basic", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class OpenAPIConfiguration {
}
