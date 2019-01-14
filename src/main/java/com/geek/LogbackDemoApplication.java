package com.geek;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LogbackDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogbackDemoApplication.class, args);
		log.info("haha");
		log.debug("haha");
		log.warn("haha");
		log.error("haha");
	}
}
