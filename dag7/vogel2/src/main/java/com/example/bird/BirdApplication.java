package com.example.bird;

import com.example.bird.model.Bird;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "The bird API", description = "The Bird api, for all your information about birds. You name a bird, we give information!"))
public class BirdApplication {
	public static void main(String[] args) {
		SpringApplication.run(BirdApplication.class, args);
		Bird b = new Bird();
		b.getId();
	}
}
