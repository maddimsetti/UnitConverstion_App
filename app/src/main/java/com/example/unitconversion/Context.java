package com.example.unitconversion;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(String fromUnit, String toUnit, double inputValue) {
        double result = strategy.convert(fromUnit, toUnit, inputValue);
        return result;
    }
}
