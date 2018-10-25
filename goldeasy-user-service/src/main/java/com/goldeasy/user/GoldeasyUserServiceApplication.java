package com.goldeasy.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.goldeasy")
public class GoldeasyUserServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(GoldeasyUserServiceApplication.class, args);
	}
}
