package com.natixis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImarticusJenkinsApplication {
	public static Logger logger = LoggerFactory.getLogger(ImarticusJenkinsApplication.class);

	public static void main(String[] args) {
		logger.info("Spring Boot App executing...");
		
		SpringApplication.run(ImarticusJenkinsApplication.class, args);
	}

}
