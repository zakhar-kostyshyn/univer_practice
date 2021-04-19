package com.exchange.example.service;

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
        return Currency.DOLLAR.convert(values.getGryvnas());
    }
}



enum Currency {
    DOLLAR(27), EURO(30), FOUNT(40);

    private final double rate;

    Currency(double rate) {
        this.rate = rate;
    }

    public double convert(double gryvnas) {
        return gryvnas / rate;
    }
}


