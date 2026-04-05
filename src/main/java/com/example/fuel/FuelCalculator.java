package com.example.fuel;

public class FuelCalculator {

    public double calculateFuelEfficiency(double distance, double fuelUsed) {
        if (distance <= 0 || fuelUsed <= 0) {
            throw new IllegalArgumentException("Distance and fuel used must be greater than zero.");
        }
        return distance / fuelUsed;
    }

    public double calculateFuelConsumed(double startFuel, double endFuel) {
        if (startFuel < 0 || endFuel < 0 || endFuel > startFuel) {
            throw new IllegalArgumentException("Invalid fuel values.");
        }
        return startFuel - endFuel;
    }
}
