package com.exchange.example.controller;

import com.exchange.example.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/exchange")
public class ExchangeController {

    @Autowired
    ExchangeService exchangeService;

    @GetMapping
    public String get(
            @PathParam("gryvnas") double gryvnas
    ) {

        double dollar = exchangeService.convertDollar(gryvnas);
        double euro = exchangeService.convertEuro(gryvnas);
        double fount = exchangeService.convertFount(gryvnas);

        return "dollar: " + dollar + " euro: " + euro + " fount: " + fount;
    }

}
