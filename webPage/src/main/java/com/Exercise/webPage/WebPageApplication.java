package com.Exercise.webPage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan("com")
@ComponentScan("com")
@SpringBootApplication
public class WebPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebPageApplication.class, args);
	}

}
