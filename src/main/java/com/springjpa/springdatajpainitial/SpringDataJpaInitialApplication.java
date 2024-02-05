package com.springjpa.springdatajpainitial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springjpa.springdatajpainitial.*"})
public class SpringDataJpaInitialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaInitialApplication.class, args);
	}

}
