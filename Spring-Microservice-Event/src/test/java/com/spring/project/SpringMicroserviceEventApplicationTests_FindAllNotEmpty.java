package com.spring.project;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.project.repository.EventRepository;

@SpringBootTest
class SpringMicroserviceEventApplicationTests_FindAllNotEmpty {

	@Autowired
	EventRepository eventRepository;

	// Comprobamos que al pedir todos los eventos no esté vacía la lista
	@Test
	void contextLoads() {

		assertThat(eventRepository.findAll()).isNotEmpty();
	}

}
