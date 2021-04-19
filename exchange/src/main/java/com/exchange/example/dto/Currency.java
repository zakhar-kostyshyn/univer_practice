package com.exchange.example.dto;

public enum Currency {
    DOLLAR(27), EURO(30), FOUNT(40);

    private final double rate;

    Currency(double rate) {
        this.rate = rate;
    }

    public double convert(double gryvnas) {
        return gryvnas / rate;
    }
}
