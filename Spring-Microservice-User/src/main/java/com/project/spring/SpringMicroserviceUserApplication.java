package com.project.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringMicroserviceUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroserviceUserApplication.class, args);
	}

}
