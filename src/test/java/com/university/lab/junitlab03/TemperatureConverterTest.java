package com.university.lab.junitlab03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheit() {
        TemperatureConverter tc = new TemperatureConverter();

        assertEquals(32, tc.celsiusToFahrenheit(0), 0.01);
        assertEquals(212, tc.celsiusToFahrenheit(100), 0.01);
    }

    @Test
    public void testFahrenheitToCelsius() {
        TemperatureConverter tc = new TemperatureConverter();

        assertEquals(0, tc.fahrenheitToCelsius(32), 0.01);
        assertEquals(100, tc.fahrenheitToCelsius(212), 0.01);
    }

    @Test
    public void testCelsiusToKelvin() {
        TemperatureConverter tc = new TemperatureConverter();

        assertEquals(273.15, tc.celsiusToKelvin(0), 0.01);
        assertEquals(373.15, tc.celsiusToKelvin(100), 0.01);
    }

    @Test
    public void testRoundTrip() {
        TemperatureConverter tc = new TemperatureConverter();

        double celsius = 25;
        double fahrenheit = tc.celsiusToFahrenheit(celsius);
        double result = tc.fahrenheitToCelsius(fahrenheit);

        assertEquals(celsius, result, 0.01);
    }
}