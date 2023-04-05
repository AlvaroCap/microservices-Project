package com.spring.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.dto.BuyDTO;
import com.spring.project.dto.ErrorDTO;
import com.spring.project.service.BuyService;

@RestController
@RequestMapping("/buy")
public class BuyController {

	@Autowired
	private BuyService buyService;

	@PostMapping
	public String validateBuy(@RequestBody BuyDTO buyDTO) {
		ErrorDTO errorDTO = buyService.consumingApi(buyDTO);

		return buyService.errorHandling(errorDTO);
	}
}
