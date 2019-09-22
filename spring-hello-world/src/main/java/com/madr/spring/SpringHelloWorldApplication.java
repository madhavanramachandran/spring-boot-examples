package com.madr.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Combination of EnableAutoConfiguration and ComponentScan and SpringBootConfiguration annotations
 */
@SpringBootApplication
public class SpringHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHelloWorldApplication.class, args);
	}

}
