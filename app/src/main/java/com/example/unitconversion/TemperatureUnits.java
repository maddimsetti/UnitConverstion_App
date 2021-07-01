package com.example.unitconversion;

public class TemperatureUnits implements Strategy {

    @Override
    public double convert(String fromUnit, String toUnit, double inputValue) {
        if(fromUnit.equals("Celsius") && toUnit.equals("Celsius")) {
            return inputValue;
        } else if (fromUnit.equals("Celsius") && toUnit.equals("Fahrenheit")) {
            double result = (inputValue * (9 / 5) + 32);
            return result;
        } else if (fromUnit.equals("Celsius") && toUnit.equals("Kelvin")) {
            double result = (inputValue + 273.15);
            return result;
        } else if(fromUnit.equals("Fahrenheit") && toUnit.equals("Celsius")) {
            double result = ((inputValue - 32) * (5 / 9));
            return inputValue;
        } else if (fromUnit.equals("Fahrenheit") && toUnit.equals("Fahrenheit")) {
            return inputValue;
        } else if (fromUnit.equals("Fahrenheit") && toUnit.equals("Kelvin")) {
            double result = (((inputValue - 32) * (5 / 9)) + 273.15);
            return result;
        } else if(fromUnit.equals("Kelvin") && toUnit.equals("Celsius")) {
            double result = ((inputValue - 273.15));
            return inputValue;
        } else if (fromUnit.equals("Kelvin") && toUnit.equals("Fahrenheit")) {
            double result = (((inputValue - 273.15) * (9 / 5)) + 32);
            return inputValue;
        } else if (fromUnit.equals("Kelvin") && toUnit.equals("Kelvin")) {
            return inputValue;
        }
        return 0;
    }
}
