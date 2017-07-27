package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.controller.SimpleController;

@SpringBootApplication
@EntityScan(basePackages = {
		  "com.example.domain"
		  })
@EnableJpaRepositories(basePackages = {
		  "com.example.repository"
		  })
@ComponentScan(basePackageClasses = SimpleController.class)
public class SilverplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SilverplateApplication.class, args);
	}
}
