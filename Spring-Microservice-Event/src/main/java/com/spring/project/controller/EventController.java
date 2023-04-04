package com.spring.project.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.dto.EventDTO;
import com.spring.project.mapper.EventMapper;
import com.spring.project.model.Event;
import com.spring.project.service.EventService;

@RestController
@RequestMapping("/events")
public class EventController {
	@Autowired
	private EventService eventService;
	@Autowired
	private EventMapper mapper;

	@GetMapping("/")
	public List<EventDTO> findAll() {
		List<Event> events = eventService.findAll();
		return mapper.convertToDto(events);
	}

}
