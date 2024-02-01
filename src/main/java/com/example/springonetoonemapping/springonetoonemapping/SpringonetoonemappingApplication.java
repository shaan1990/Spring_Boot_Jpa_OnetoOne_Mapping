package com.example.springonetoonemapping.springonetoonemapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = UserController.class)
public class SpringonetoonemappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringonetoonemappingApplication.class, args);
	}

}
