package org.example;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static String isExtremeTemperature(double celsius) {
        if (celsius < -40.0 || celsius > 50){
            return "The celsius temperature is extreme";
        } else {
            return "The celsius temperature is not extreme";
        }
    }
}
