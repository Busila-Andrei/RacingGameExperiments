package org.fasttrackit.vehicles.cheater;

import org.fasttrackit.vehicles.Vehicle;

public class CheatingVehicle extends Vehicle {

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + " is accelerating with " + speed + " hm/h for " + durationInHours + "h");
        System.out.println("Cheater!!!");

        double distance = speed * durationInHours * 2;

        totalTraveledDistance += distance;

        System.out.println("Total travel distance for " + getName() + ": " + totalTraveledDistance);


        return distance;
    }

    @Override
    public CheatingVehicle reset() {
        super.reset();
        return this;
    }

    public void cheat() {
        totalTraveledDistance *= 2;
        System.out.println("Updated  total disstance " + totalTraveledDistance);
    }
}
