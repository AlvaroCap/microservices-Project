package main.java.com.spring.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import main.java.com.spring.project.dto.BuyDTO;

@Controller
@RequestMapping("/buy")
public class BuyController {

    @Autowired
    private BuyDTO buyDTO;

    @PostMapping("/")
    public void validateBuy(@RequestParam String userName, @RequestParam String creditCard,
            @RequestParam String expiredMonth, @RequestParam String expiredYear, @RequestParam String cvv,
            @RequestParam String issuer, @RequestParam String concept, @RequestParam String quantity) {

    }
}
