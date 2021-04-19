package com.exchange.example.service;

import com.exchange.example.dto.Currency;
import com.exchange.example.dto.Values;
import org.springframework.stereotype.Service;

@Service
public class ExchangeService {

    public double convertDollar(double gryvans) {
        return Currency.DOLLAR.convert(gryvans);
    }

    public double convertEuro(double gryvans) {
        return Currency.EURO.convert(gryvans);
    }

    public double convertFount(double gryvans) {
        return Currency.FOUNT.convert(gryvans);
    }

    public double convert(Values values) {
        return values.getCurrency().convert(values.getGryvnas());
    }
}






