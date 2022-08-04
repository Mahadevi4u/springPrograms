package com.example.database;

import com.example.database.JPA.PersonJpaRepository;
import com.example.database.JPA.PersonSpringData;
import com.example.database.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataDemoApp implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonSpringData repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApp.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		logger.info("User id is -----> {}", repository.findById(2));
		logger.info("Inserted data is ---> {}", repository.insert(new Person(1003, "Varalakshmi", "Chennai", "vara123@gmail.com")));
		logger.info("Updated data is ---> {}", repository.update(new Person(4, "Sandeep", "Banglore", "sadhana@gmail.com")));
		repository.delete(4);
		logger.info("The Data in the database is -----> {}", repository.findAll());
	}

	}

