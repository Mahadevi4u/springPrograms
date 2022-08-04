package com.example.spring.basics.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	private sortAlgo sortmethods;
	public SpringDemoApplication(sortAlgo sortmethods) {
		super();
		this.sortmethods = sortmethods;
	}

	
	
	public static void main(String[] args) {
		
       sortmethods.
		
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
