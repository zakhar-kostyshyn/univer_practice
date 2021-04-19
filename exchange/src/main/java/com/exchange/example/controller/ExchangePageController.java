package com.exchange.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExchangePageController {

    @GetMapping
    public String page() {
        return "exchange_page";
    }



}
