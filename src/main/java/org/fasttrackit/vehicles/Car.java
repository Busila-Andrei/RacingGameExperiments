package org.fasttrackit.vehicles;

import org.fasttrackit.Engine;

//"is-a" relantionship (inheritance)
public class Car extends AutoVehicle{

    private int doorCount;


    public Car(Engine engine) {
        super(engine);
    }

    public Car() {

    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorCount=" + doorCount +
                "} " + super.toString();
    }
}
