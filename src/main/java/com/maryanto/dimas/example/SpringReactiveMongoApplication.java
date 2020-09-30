package com.maryanto.dimas.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class SpringReactiveMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactiveMongoApplication.class, args);
	}

}
