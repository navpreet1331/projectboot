package com.capgemini.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.bookstore.dao.AddbooktocartDao;
import com.capgemini.bookstore.entity.Addbooktocart;


@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(BookstoreApplication.class);
	@Autowired
	private AddbooktocartDao addbooktocartDao;

	public static void main(String[] args) {
		logger.info("this is a info message");
	      logger.warn("this is a warn message");
	      logger.error("this is a error message");
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Addbooktocart add = new Addbooktocart(10, "nav", "rjt@gmail.com");
		addbooktocartDao.save(add);
		// TODO Auto-generated method stub
		System.out.println("record Inserted");
		
	}

}
