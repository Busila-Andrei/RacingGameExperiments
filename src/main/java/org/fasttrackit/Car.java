package org.fasttrackit;

public class Car {

    String name;
    double fuelLevel;
    double mileage;
    double totalTraveledDistance;
    double maxSpeed;

    int doorCount;
    boolean damaged;
    String color;

    // has-a relationship (aggregation)
    Engine engine;
}
