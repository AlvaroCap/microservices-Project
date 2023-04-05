package com.project.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    
}
