package com.example.fuel;

public class App {
    public static void main(String[] args) {
        FuelCalculator calculator = new FuelCalculator();

        double distance = 300;
        double fuelUsed = 20;

        double efficiency = calculator.calculateFuelEfficiency(distance, fuelUsed);

        System.out.println("Fuel Efficiency: " + efficiency + " km/l");
    }
}