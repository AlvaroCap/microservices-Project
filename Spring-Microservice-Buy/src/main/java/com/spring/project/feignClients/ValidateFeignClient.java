package com.spring.project.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.project.dto.BuyDTO;
import com.spring.project.dto.ErrorDTO;

import org.springframework.web.bind.annotation.PathVariable;

//Se añade este nombre : spring.application.name=catalog
//Indico que voy a contactar con esa ruta

@FeignClient(name="Prueba", url = "http://proyectorestbanco-env.eba-2xzwedvv.eu-west-3.elasticbeanstalk.com/")
public interface ValidateFeignClient {

    @PostMapping("/pasarela/compra")
    public ErrorDTO validateBuy(@RequestBody BuyDTO buyDTO);

}
