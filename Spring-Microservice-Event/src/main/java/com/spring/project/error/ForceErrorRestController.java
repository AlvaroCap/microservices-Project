package com.spring.project.error;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForceErrorRestController {
	@GetMapping(value = "/event/throwException")
	public void throwException() {
		throw new IllegalArgumentException("\"I am the error message from Rest Controller\"");
	}
}
