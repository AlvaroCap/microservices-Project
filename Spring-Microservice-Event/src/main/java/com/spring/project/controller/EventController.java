package com.spring.project.controller;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.spring.project.dto.EventDTO;
import com.spring.project.mapper.EventMapper;
import com.spring.project.model.Event;
import com.spring.project.service.EventService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController
@RequestMapping("/event")
public class EventController {
	private static final Logger logger = LoggerFactory.getLogger(EventController.class);

	@Autowired
	private EventService eventService;
	@Autowired
	private EventMapper mapper;

	@Operation(summary = "Listado de Events", description = "Devuelve un listado de los eventos registrados", tags = {
			"event" })

	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Listado de eventos desplegado", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Event.class)) }),
			@ApiResponse(responseCode = "400", description = "No válido", content = @Content),
			@ApiResponse(responseCode = "404", description = "Ruta no encontrada. No se encuentra el listado de Eventos", content = @Content) })
	@GetMapping()
	public List<EventDTO> findAll() {
		List<Event> events = eventService.findAll();
		logger.info("------ readStudent (GET) ");

		return mapper.convertToDto(events);
	}

	@Operation(summary = "Añadir events", description = "Añadir un Evento al listado", tags = { "event" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se ha añadido un evento", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Event.class)) }),
			@ApiResponse(responseCode = "400", description = "No válido (NO se ha agregado) ", content = @Content),
			@ApiResponse(responseCode = "404", description = "No se ha podido añadir, ruta no encontrada", content = @Content) })
	@PostMapping("/save")
	public ResponseEntity<EventDTO> save(@Valid @RequestBody Event event) {
		Event e = eventService.save(event);
		URI ubicacion = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(e.getId())
				.toUri();
		return ResponseEntity.created(ubicacion).body(mapper.convertToDto(e));
	}

}
