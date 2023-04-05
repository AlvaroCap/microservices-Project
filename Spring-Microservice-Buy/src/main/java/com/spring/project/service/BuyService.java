package com.spring.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.dto.BuyDTO;
import com.spring.project.dto.ErrorDTO;
import com.spring.project.feignClients.ValidateFeignClient;

@Service
public class BuyService {

	@Autowired
	private ValidateFeignClient validateFeignClient;

	public ErrorDTO consumingApi(BuyDTO buyDTO) {
		return validateFeignClient.validateBuy(buyDTO);
	}

	public String errorHandling(ErrorDTO errorDTO) {
		String answer = "";
		switch (errorDTO.getStatus()) {
			case "200.0001":
				answer = "Transacción correcta";
				break;
			case "400.0001":
				answer = "No hay fondos suficientes en la cuenta";
				break;
			case "400.0002":
				answer = "No se encuentran los datos del cliente";
				break;
			case "400.0003":
				answer = "El número de la tarjeta no es válido";
				break;
			case "400.0004":
				answer = "El formato cvv no es válido";
				break;
			case "400.0005":
				answer = "El mes " + errorDTO.getInfo().getMesCaducidad() + " no es correcto";
				break;
			case "400.0006":
				answer = "El año " + errorDTO.getInfo().getYearCaducidad() + " no es correcto";
				break;
			case "400.0007":
				answer = "La fecha de caducidad debe ser posterior al día actual";
				break;
			case "400.0008":
				answer = "El formato del nombre no es correcto";
				break;
			case "500.0001":
				answer = "El sistema se encuentra inestable";
				break;

		}
		return answer;
	}
}
