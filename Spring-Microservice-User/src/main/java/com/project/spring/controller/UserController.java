package com.project.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.dto.UserDTO;
import com.project.spring.mapper.UserMapper;
import com.project.spring.model.User;
import com.project.spring.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserMapper mapper;

	@GetMapping
	public List<UserDTO> findAll() {
		List<User> events = userService.findAll();
		return mapper.convertToDto(events);
	}

	@PostMapping("/save")
	public UserDTO save(@RequestBody User user) {
		return mapper.convertToDto(userService.save(user));
	}

}
