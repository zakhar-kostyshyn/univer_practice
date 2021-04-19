package com.exchange.example.controller;

import com.exchange.example.dto.Values;
import com.exchange.example.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ExchangePageController {

    @Autowired
    private ExchangeService exchangeService;

    @GetMapping
    public String mainPage(Model model) {
        model.addAttribute("values", new Values());
        return "exchange_page";
    }

    @PostMapping
    public String formHandler(
            @ModelAttribute("values") Values values,
            Model model
    ) {
        double converted = exchangeService.convert(values);
        model.addAttribute("converted", converted);
        return "exchange_page";
    }

}

