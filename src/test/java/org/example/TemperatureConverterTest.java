package org.example;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
TemperatureConverter temperatureConverter = new TemperatureConverter();
        @org.junit.jupiter.api.Test
        void celsiusToFahrenheit() {
            assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0));
            assertEquals(68, TemperatureConverter.celsiusToFahrenheit(20));
            assertEquals(122, TemperatureConverter.celsiusToFahrenheit(50));
        }

        @org.junit.jupiter.api.Test
        void fahrenheitToCelsius() {
            assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32));
            assertEquals(-10, TemperatureConverter.fahrenheitToCelsius(14));
            assertEquals(-25, TemperatureConverter.fahrenheitToCelsius(-13));
        }

        @org.junit.jupiter.api.Test
        void isExtremeTemperature() {
            assertEquals("The celsius temperature is not extreme", TemperatureConverter.isExtremeTemperature(0));
            assertEquals("The celsius temperature is not extreme", TemperatureConverter.isExtremeTemperature(42));
            assertEquals("The celsius temperature is extreme", TemperatureConverter.isExtremeTemperature(-52));
            assertEquals("The celsius temperature is extreme", TemperatureConverter.isExtremeTemperature(51));
        }
}