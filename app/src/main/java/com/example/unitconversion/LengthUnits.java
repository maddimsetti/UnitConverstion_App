package com.example.unitconversion;

import android.widget.TextView;

import javax.xml.transform.Result;

public class LengthUnits implements Strategy {


    @Override
    public double convert(String fromUnit, String toUnit, double inputValue) {

        if(fromUnit.equals("Kilometre") && toUnit.equals("Kilometre")) {
           return inputValue;
        } else if (fromUnit.equals("Kilometre") && toUnit.equals("Meter")) {
            double result = (inputValue * 1000);
            return result;
        } else if (fromUnit.equals("Kilometre") && toUnit.equals("Centimetre")) {
            double result = (inputValue * 100000);
            return result;
        } else if (fromUnit.equals("Kilometre") && toUnit.equals("Millimetre")) {
            double result = (inputValue * 1e+6);
            return result;
        } else if (fromUnit.equals("Kilometre") && toUnit.equals("Foot")) {
            double result = inputValue * 3281;
            return result;
        } else if (fromUnit.equals("Kilometre") && toUnit.equals("Inch")) {
            double result = inputValue * 39370;
            return result;
        } else if (fromUnit.equals("Meter") && toUnit.equals("Meter")) {
            return inputValue;
        } else if (fromUnit.equals("Meter") && toUnit.equals("Kilometer")) {
            double result = inputValue / 1000;
            return result;
        } else if (fromUnit.equals("Meter") && toUnit.equals("Centimetre")) {
            double result = inputValue * 100;
            return result;
        }  else if (fromUnit.equals("Meter") && toUnit.equals("Millimetre")) {
            double result = inputValue * 1000;
            return result;
        } else if (fromUnit.equals("Meter") && toUnit.equals("Foot")) {
            double result =  (inputValue * 3.281);
            return result;
        } else if (fromUnit.equals("Meter") && toUnit.equals("Inch")) {
            double result =  (inputValue * 39.37);
            return result;
        } else if(fromUnit.equals("Centimetre") && toUnit.equals("Kilometre")) {
            double result = (inputValue / 100000);
            return result;
        } else if (fromUnit.equals("Centimetre") && toUnit.equals("Meter")) {
            double result = (inputValue * 100);
            return result;
        } else if (fromUnit.equals("Centimetre") && toUnit.equals("Centimetre")) {
            return inputValue;
        } else if (fromUnit.equals("Centimetre") && toUnit.equals("Millimetre")) {
            double result = inputValue * 10;
            return result;
        } else if (fromUnit.equals("Centimetre") && toUnit.equals("Foot")) {
            double result = inputValue * 30.48;
            return result;
        } else if (fromUnit.equals("Centimetre") && toUnit.equals("Inch")) {
            double result = inputValue * 2.54;
            return result;
        } else if(fromUnit.equals("Millimetre") && toUnit.equals("Kilometre")) {
            double result = (inputValue / 1e+6);
            return result;
        } else if (fromUnit.equals("Millimetre") && toUnit.equals("Meter")) {
            double result = (inputValue / 1000);
            return result;
        } else if (fromUnit.equals("Millimetre") && toUnit.equals("Centimetre")) {
            double result = inputValue / 10;
            return result;
        } else if (fromUnit.equals("Millimetre") && toUnit.equals("Millimetre")) {
            return inputValue;
        } else if (fromUnit.equals("Millimetre") && toUnit.equals("Foot")) {
            double result = inputValue / 30.48;
            return result;
        } else if (fromUnit.equals("Millimetre") && toUnit.equals("Inch")) {
            double result = inputValue / 2.54;
            return result;
        } else if(fromUnit.equals("Foot") && toUnit.equals("Kilometre")) {
            double result = (inputValue / 3281);
            return result;
        } else if (fromUnit.equals("Foot") && toUnit.equals("Meter")) {
            double result = (inputValue / 3.281);
            return result;
        } else if (fromUnit.equals("Foot") && toUnit.equals("Centimetre")) {
            double result = inputValue * 30.48;
            return result;
        } else if (fromUnit.equals("Foot") && toUnit.equals("Millimetre")) {
            double result = inputValue * 305;
            return result;
        } else if (fromUnit.equals("Foot") && toUnit.equals("Foot")) {
            return inputValue;
        } else if (fromUnit.equals("Foot") && toUnit.equals("Inch")) {
            double result = inputValue * 12;
            return result;
        } else if(fromUnit.equals("Inch") && toUnit.equals("Kilometre")) {
            double result = (inputValue / 5.085e-5);
            return result;
        } else if (fromUnit.equals("Inch") && toUnit.equals("Meter")) {
            double result = (inputValue / 0.0508);
            return result;
        } else if (fromUnit.equals("Inch") && toUnit.equals("Centimetre")) {
            double result = inputValue * 2.54;
            return result;
        } else if (fromUnit.equals("Inch") && toUnit.equals("Millimetre")) {
            double result = inputValue * 25.4;
            return result;
        } else if (fromUnit.equals("Inch") && toUnit.equals("Foot")) {
            double result = inputValue / 0.166667;
            return result;
        } else if (fromUnit.equals("Inch") && toUnit.equals("Inch")) {
            return inputValue;
        }
        return 0;
    }
}
