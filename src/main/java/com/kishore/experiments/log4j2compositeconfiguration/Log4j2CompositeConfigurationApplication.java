package com.kishore.experiments.log4j2compositeconfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4j2CompositeConfigurationApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(Log4j2CompositeConfigurationApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4j2CompositeConfigurationApplication.class, args);
		LOGGER.debug("Application started successfully !!");
	}

}
