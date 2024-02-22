package com.example.demo.config;


import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenAPIConfig {


    @Bean
    public OpenAPI myOpenAPI() {

        Info info = new Info()
                .title("titolo generico")
                .version("1.0")
                .contact(new Contact())
                .description("descrizione").termsOfService("https://google.com")
                .license(new License());

        return new OpenAPI().info(info);
    }
}