package br.com.joseoliveira.movieflix.config;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SecurityScheme(
        name = "bearerAuth",
        type = SecuritySchemeType.HTTP,
        scheme = "bearer"
)
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {

        Contact contact = new Contact();
        contact.name("José Roberto de Oliveira Júnior");
        contact.email("jroberto.economia93@gmail.com");

        Info info = new Info();
        info.title("MovieFlix");
        info.version("v1");
        info.description("Aplicação para gerenciamento de catálogo de filmes");
        info.contact(contact);

        return new OpenAPI().info(info);
    }
}
