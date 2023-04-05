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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController
@RequestMapping("/event")
public class EventController {

	@Autowired
	private EventService eventService;
	@Autowired
	private EventMapper mapper;

	@Operation(summary = "Buscar events", description = "Dado un ID, devuelve un objeto Event", tags = {
			"event" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Estudiante localizado", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Event.class)) }),
			@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content),
			@ApiResponse(responseCode = "404", description = "Event no encontrado (NO implementado)", content = @Content) })
	@GetMapping("/")
	public List<EventDTO> findAll() {
		List<Event> events = eventService.findAll();
		return mapper.convertToDto(events);
	}

	@PostMapping("/save")
	public Event save(@RequestBody Event event) {
		return eventService.save(event);
	}
}
