package com.example.mycollections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = {"com.example.mycollections", "com.example.mycollections.controllers"})

public class MycollectionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycollectionsApplication.class, args);
	}

}
