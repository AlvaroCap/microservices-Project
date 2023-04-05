package com.spring.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.dto.BuyDTO;
import com.spring.project.dto.ErrorDTO;
import com.spring.project.model.Buy;
import com.spring.project.service.BuyService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController
@RequestMapping("/buy")
public class BuyController {

	@Autowired
	private BuyService buyService;

	@Operation(summary = "Envio de datos para validar", description = "Manda informacion a un Microservicio Validador", tags = {
			"event" })

	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Envio de datos realizados", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Buy.class)) }),
			@ApiResponse(responseCode = "400", description = "No válido", content = @Content),
			@ApiResponse(responseCode = "404", description = "Ruta no encontrada para continuar con la validacion. ", content = @Content) })
	@PostMapping
	public String validateBuy(@RequestBody BuyDTO buyDTO) {
		ErrorDTO errorDTO = buyService.consumingApi(buyDTO);

		return buyService.errorHandling(errorDTO);
	}
}
