package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagingAppSpringApplication {

	public static final Logger logger = LoggerFactory.getLogger(MessagingAppSpringApplication.class);
	public static void main(String[] args) {
		logger.info("Messaging App Practice example");
		SpringApplication.run(MessagingAppSpringApplication.class, args);
	}

}
