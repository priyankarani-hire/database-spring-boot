package com.rani.study.databaserani;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rani.study.databaserani.repository.PersonJdbcDao;

@SpringBootApplication
public class DatabaseRaniApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseRaniApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users-> {}",dao.findAll());
		logger.info("USer with ID 10001 "+ dao.findById(10001));
		logger.info("user with name and location: "+ dao.findByNameAndLocation("Bangalore", "Raj"));
	}

}
