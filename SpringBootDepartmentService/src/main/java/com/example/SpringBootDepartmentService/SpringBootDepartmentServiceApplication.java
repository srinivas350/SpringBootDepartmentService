package com.example.SpringBootDepartmentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackages="com.example")
@EnableWebMvc
@EnableJpaRepositories("com.example")
@EntityScan("com.example")
public class SpringBootDepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDepartmentServiceApplication.class, args);
	}

}
