package com.example.unitconversion;

public class MassUnits implements Strategy {
    @Override
    public double convert(String fromUnit, String toUnit, double inputValue) {
        if(fromUnit.equals("Tonne") && toUnit.equals("Tonne")) {
            return inputValue;
        } else if (fromUnit.equals("Tonne") && toUnit.equals("Kilogram")) {
            double result = (inputValue * 1000);
            return result;
        } else if (fromUnit.equals("Tonne") && toUnit.equals("Gram")) {
            double result = (inputValue * 1e+6);
            return result;
        } else if (fromUnit.equals("Tonne") && toUnit.equals("Milligram")) {
            double result = (inputValue * 1e+9);
            return result;
        } else if(fromUnit.equals("Kilogram") && toUnit.equals("Tonne")) {
            double result = (inputValue / 1000);
            return result;
        } else if (fromUnit.equals("Kilogram") && toUnit.equals("Kilogram")) {
            return inputValue;
        } else if (fromUnit.equals("Kilogram") && toUnit.equals("Gram")) {
            double result = (inputValue * 1000);
            return result;
        } else if (fromUnit.equals("Kilogram") && toUnit.equals("Milligram")) {
            double result = (inputValue * 1e+6);
            return result;
        } else if(fromUnit.equals("Gram") && toUnit.equals("Tonne")) {
            double result = (inputValue / 1e+6);
            return result;
        } else if (fromUnit.equals("Gram") && toUnit.equals("Kilogram")) {
            double result = (inputValue / 1000);
            return result;
        } else if (fromUnit.equals("Gram") && toUnit.equals("Gram")) {
            return inputValue;
        } else if (fromUnit.equals("Gram") && toUnit.equals("Milligram")) {
            double result = (inputValue * 1000);
            return result;
        } else if(fromUnit.equals("Milligram") && toUnit.equals("Tonne")) {
            double result = (inputValue / 1e+9);
            return result;
        } else if (fromUnit.equals("Milligram") && toUnit.equals("Kilogram")) {
            double result = (inputValue / 1e+6);
            return result;
        } else if (fromUnit.equals("Milligram") && toUnit.equals("Gram")) {
            double result = (inputValue / 0.001);
            return inputValue;
        } else if (fromUnit.equals("Milligram") && toUnit.equals("Milligram")) {
            return inputValue;
        }
        return 0;
    }
}
