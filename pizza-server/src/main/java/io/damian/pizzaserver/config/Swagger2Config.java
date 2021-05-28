package io.damian.pizzaserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;
import static springfox.documentation.spi.DocumentationType.OAS_30;

@Configuration
@EnableSwagger2
@Profile("!prod")
public class Swagger2Config {

    @Bean
    public Docket api() {
        return new Docket(OAS_30).select()
                .apis(basePackage("io.damian.pizzaserver.controller"))
                .paths(regex("/.*"))
                .build();
    }
}
