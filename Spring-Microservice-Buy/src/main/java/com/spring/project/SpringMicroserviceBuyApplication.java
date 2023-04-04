package com.spring.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringMicroserviceBuyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroserviceBuyApplication.class, args);
	}

}
