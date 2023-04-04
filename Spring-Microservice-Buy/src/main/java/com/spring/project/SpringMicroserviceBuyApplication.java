package com.spring.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringMicroserviceBuyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroserviceBuyApplication.class, args);
	}

}
