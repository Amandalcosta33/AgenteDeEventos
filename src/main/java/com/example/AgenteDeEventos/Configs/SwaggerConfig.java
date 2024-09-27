package com.example.AgenteDeEventos.Configs;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("AGENTE DE EVENTOS")
                        .version("1.0")
                        .description("API documentation for the AGENTE DE EVENTOS application.")
                        .contact(new Contact()
                                .name("Amanda Lopes Costa")
                                .email("amanda.lcosta33@gmail.com")
                                .url("https://www.linkedin.com/in/amandalopesct/")) // URL geralmente deve ser um link, ajuste conforme necessário
                        .license(new License()
                                .name("License of API")
                                .url("API license URL")));
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/api/**")
                .build();
    }
}
