package com.releaseit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.releaseit")
public class ReleaseitApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(ReleaseitApplication.class, args);
	}

}
