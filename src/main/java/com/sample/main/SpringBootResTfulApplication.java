package com.sample.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.sample.controller")
@EnableJpaRepositories("com.sample.repository")
@EntityScan("com.sample.model")
@ComponentScan({"com.sample", "com.sample.controller"})
public class SpringBootResTfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootResTfulApplication.class, args);
	}

}

