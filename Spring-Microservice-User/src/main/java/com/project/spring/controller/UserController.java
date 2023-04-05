package com.project.spring.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.project.spring.dto.UserDTO;
import com.project.spring.mapper.UserMapper;
import com.project.spring.model.User;
import com.project.spring.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserMapper mapper;

	@Operation(summary = "Listado de Users", description = "Devuelve un listado de los eventos registrados", tags = {
			"event" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Listado de usuarios desplegado", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = User.class)) }),
			@ApiResponse(responseCode = "400", description = "No válido", content = @Content),
			@ApiResponse(responseCode = "404", description = "Ruta no encontrada. No se encuentra el listado de Usuarios", content = @Content) })
	@GetMapping
	public List<UserDTO> findAll() {
		List<User> events = userService.findAll();
		return mapper.convertToDto(events);
	}

	@Operation(summary = "Añadir users", description = "Añadir un User al listado", tags = {
			"event" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se ha añadido un user", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = User.class)) }),
			@ApiResponse(responseCode = "400", description = "No válido (NO se ha agregado) ", content = @Content),
			@ApiResponse(responseCode = "404", description = "No se ha podido añadir, ruta no encontrada", content = @Content) })
	@PostMapping("/save")
	public ResponseEntity<UserDTO> save(@Valid @RequestBody User user) {
		User newTask = userService.save(user);
		URI rute = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newTask.getId())
				.toUri();
		return ResponseEntity.created(rute).body(mapper.convertToDto(newTask));
	}

}
