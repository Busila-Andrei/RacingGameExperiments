package org.fasttrackit;

//"is-a" relantionship (inheritance)
public class Car extends AutoVehicle{

    int doorCount;


    public Car(Engine engine) {
        super(engine);
    }
}
