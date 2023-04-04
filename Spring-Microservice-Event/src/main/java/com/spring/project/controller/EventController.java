package com.spring.project.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.project.dto.EventDTO;
import com.spring.project.service.EventService;

@Controller
@RequestMapping("/")
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@GetMapping("/events")
	public Set<EventDTO> findAll(){
		return 
	}
}
