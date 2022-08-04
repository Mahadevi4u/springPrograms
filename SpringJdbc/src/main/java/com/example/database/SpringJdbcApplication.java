package com.example.database;

import com.example.database.jdbc.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonDao personDao;


	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All Users ----> {}",personDao.getData());
		logger.info("User id is -----> {}",personDao.findById(2));
	}
}
