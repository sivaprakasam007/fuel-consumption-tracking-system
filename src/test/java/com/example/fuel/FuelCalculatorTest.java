package com.example.fuel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuelCalculatorTest {

    FuelCalculator calculator = new FuelCalculator();

    @Test
    void testFuelCalculationAccuracy() {
        double result = calculator.calculateFuelEfficiency(300, 20);
        assertEquals(15.0, result, 0.01);
    }

    @Test
    void testAnotherFuelCalculation() {
        double result = calculator.calculateFuelEfficiency(500, 25);
        assertEquals(20.0, result, 0.01);
    }

    @Test
    void testInvalidDistance() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateFuelEfficiency(0, 20);
        });
        assertEquals("Distance and fuel used must be greater than zero.", exception.getMessage());
    }

    @Test
    void testInvalidFuelUsed() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateFuelEfficiency(300, -5);
        });
        assertEquals("Distance and fuel used must be greater than zero.", exception.getMessage());
    }

    @Test
    void testFuelConsumedCalculation() {
        double result = calculator.calculateFuelConsumed(50, 20);
        assertEquals(30.0, result, 0.01);
    }

    @Test
    void testInvalidFuelConsumedValues() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateFuelConsumed(20, 30);
        });
        assertEquals("Invalid fuel values.", exception.getMessage());
    }
}