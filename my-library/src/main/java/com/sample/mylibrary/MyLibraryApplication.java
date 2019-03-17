package com.sample.mylibrary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages= {"com.sample.resources","com.sample.service"})
public class MyLibraryApplication {
	private static final Logger logger = LoggerFactory.getLogger(MyLibraryApplication.class);

	public static void main(String[] args) {
		  logger.info("this is a info message");
	      logger.warn("this is a warn message");
	      logger.error("this is a error message");
		SpringApplication.run(MyLibraryApplication.class, args);
	}

}
