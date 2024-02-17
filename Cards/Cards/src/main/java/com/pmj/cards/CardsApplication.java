package com.pmj.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.pmj.cards.controller") })
@EnableJpaRepositories("com.pmj.cards.repository")
@EntityScan("com.pmj.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "PMJ Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Pramitha Jayasooriya",
						email = "lpramitha@gmail.com",
						url = "https://www.pmj.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.pmj.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "PMJ Cards microservice REST API Documentation",
				url = "https://www.pmj.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
