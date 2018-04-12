package com.web.springangular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularApplication.class, args);
	}
}
