package com.chenyi.learningRabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
public class LearningRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningRabbitmqApplication.class, args);
	}

}
