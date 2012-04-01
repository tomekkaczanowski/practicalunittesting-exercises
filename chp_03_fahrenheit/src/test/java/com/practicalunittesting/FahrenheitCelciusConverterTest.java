package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class FahrenheitCelciusConverterTest {

    public void shouldConvertCelciusToFahrenheit() {
        assertEquals(FahrenheitCelciusConverter.toFahrenheit(0), 32);
        assertEquals(FahrenheitCelciusConverter.toFahrenheit(37), 98);
        assertEquals(FahrenheitCelciusConverter.toFahrenheit(100), 212);
    }

    public void shouldConvertFahrenheitToCelcius() {
        assertEquals(FahrenheitCelciusConverter.toCelcius(32), 0);
        assertEquals(FahrenheitCelciusConverter.toCelcius(100), 37);
        assertEquals(FahrenheitCelciusConverter.toCelcius(212), 100);
    }

}
