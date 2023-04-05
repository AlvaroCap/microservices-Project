package com.spring.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@PostMapping("/save")
	public EventDTO save(@RequestBody Event event) {
		return mapper.convertToDto(eventService.save(event));
	}
}
