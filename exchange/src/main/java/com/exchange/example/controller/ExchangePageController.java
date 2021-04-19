package com.exchange.example.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ExchangePageController {

    @GetMapping
    public String mainPage(Model model) {
        model.addAttribute("values", new Values());
        return "exchange_page";
    }

    @PostMapping
    public String formHandler(
            @ModelAttribute("values") Values values
    ) {
        System.out.println("values = " + values);
        return "redirect:/";
    }

}

@Data
class Values {
    double gryvnas;
}
