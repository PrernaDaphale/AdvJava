package com.cricket.CricketworldCup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")

public class CricketworldCupApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketworldCupApplication.class, args);
	}

}
