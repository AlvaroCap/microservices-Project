package com.spring.project.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

//Se añade este nombre : spring.application.name=catalog
//Indico que voy a contactar con esa ruta
@FeignClient(url = "http://proyectorestbanco-env.eba-2xzwedvv.eu-west-3.elasticbeanstalk.com/")

public class validateFeignClient {

    // @PostMapping("/pasarela/compra")
    // public BuyResponse getProduct(@PathVariable Long id);
}
