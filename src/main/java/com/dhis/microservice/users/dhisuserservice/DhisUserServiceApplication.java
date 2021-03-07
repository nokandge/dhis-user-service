package com.dhis.microservice.users.dhisuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DhisUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DhisUserServiceApplication.class, args);
		System.out.println("Started Spring....");
	}

}
