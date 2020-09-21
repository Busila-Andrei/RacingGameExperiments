package org.fasttrackit;

public class Vehicle {

    //instance variables
    String name;
    double fuelLevel;
    double mileage;
    double totalTraveledDistance;
    double maxSpeed;

    boolean damaged;
    String color;

    public double accelerate(double speed, double durationInHours) {
        // Ferrari is accelerating with 100 km/h for 1h
        System.out.println(name + " is accelerating with " + speed + " hm/h for " + durationInHours + "h");

        double distance = speed * durationInHours;

        totalTraveledDistance = totalTraveledDistance + distance;

        System.out.println("Total travel distance for " + name + ": " + totalTraveledDistance);

        double usedFuel = distance * mileage /100;

        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel for vehicle " + name + ": " + usedFuel);



        return distance;
    }
}
