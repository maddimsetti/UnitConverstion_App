package com.example.unitconversion;

public class VolumeUnits implements Strategy {

    @Override
    public double convert(String fromUnit, String toUnit, double inputValue) {
        if(fromUnit.equals("Liter") && toUnit.equals("Liter")) {
            return inputValue;
        } else if (fromUnit.equals("Liter") && toUnit.equals("Milliliter")) {
            double result = (inputValue * 1000);
            return result;
        } else if(fromUnit.equals("Milliliter") && toUnit.equals("Liter")) {
            double result = (inputValue / 1000);
            return result;
        } else if (fromUnit.equals("Milliliter") && toUnit.equals("Milliliter")) {
            return inputValue;
        }
        return 0;
    }
}
