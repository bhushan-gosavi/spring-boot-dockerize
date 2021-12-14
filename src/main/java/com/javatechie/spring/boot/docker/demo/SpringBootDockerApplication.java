package com.javatechie.spring.boot.docker.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

	private static Logger logger = LogManager.getLogger(SpringBootDockerApplication.class);
	@GetMapping("/message")
	public String getMessage() {
		logger.info("Printing log using log4j!");
		return "Welcome to JavaApp..!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}
