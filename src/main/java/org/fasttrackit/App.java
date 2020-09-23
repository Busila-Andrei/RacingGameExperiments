package org.fasttrackit;

import org.fasttrackit.vehicles.AutoVehicle;
import org.fasttrackit.vehicles.Car;
import org.fasttrackit.vehicles.Vehicle;
import org.fasttrackit.vehicles.cheater.CheatingVehicle;

public class App
{
    public static void main( String[] args )
    {
        //Game game = new Game();
       // game.start();

        Vehicle cheatingVehicle = new CheatingVehicle();
        cheatingVehicle.setName("Cheater");

        cheatingVehicle.accelerate(60, 1);

        //cheatingVehicle.accelerate(60);
       if (cheatingVehicle instanceof  CheatingVehicle) {
           ((CheatingVehicle) cheatingVehicle).cheat();
       }

        // example
        /*Engine engine = new Engine();
        engine.setManufacturer("Renault");
        engine.setCapacity(1400);
        AutoVehicle autoVehicle = new AutoVehicle(engine);
        AutoVehicle autoVehicle2 = new AutoVehicle();

        new Car();
        autoVehicle.accelerate(100);
        autoVehicle2.accelerate(100, 1);


        System.out.println("Engine capacity " + engine.getCapacity());
        System.out.println(engine.getCapacity());
        System.out.println(engine);

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setName("Dacia");

        vehicle1.totalVehicleCount = 1;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setName("Lada");

        vehicle2.totalVehicleCount = 2;

        System.out.println("Total count from vehicle " + vehicle1.getName() + ": " + vehicle1.getTotalVehicleCount());
        System.out.println("Total count from vehicle " + vehicle2.getName() + ": " + vehicle2.getTotalVehicleCount());
        System.out.println("Total count from Vehicle class: " + vehicle2.totalVehicleCount);

        Engine autoVehicleEngine = new Engine();
        autoVehicleEngine.setManufacturer("WW");
        AutoVehicle autoVehicle = new AutoVehicle(autoVehicleEngine);

        Engine engine1 = new Engine();
        engine1.setManufacturer("Ferrari");
        engine1.setCapacity(3000);


        Car carReference = new Car(engine1);
        carReference.setName("Ferrari");
        carReference.setMaxSpeed(300);
        carReference.setFuelLevel(60);
        carReference.setMileage(12.5);
        carReference.setTotalTraveledDistance(0);
        carReference.setDamaged(false);
        carReference.setDoorCount(1);
        carReference.setColor("Red");

        System.out.println(carReference);

        System.out.println("Properties of car " + carReference.getName());
        System.out.println("Max speed: " + carReference.getMaxSpeed());
        System.out.println("Fuel level: " + carReference.getFuelLevel());
        System.out.println("Mileage: " + carReference.getMileage());
        System.out.println("Total travel distance: " + carReference.getTotalTraveledDistance());
        System.out.println("Damaged: " + carReference.isDamaged());
        System.out.println("Door Count: " + carReference.getDoorCount());
        System.out.println("Color: " + carReference.getColor());
        System.out.println(carReference);
        System.out.println();



        carReference.setEngine(engine1);

        System.out.println("Engine1 capacity: " + engine1.getCapacity());
        System.out.println("Car engine capacity: " + carReference.getEngine().getCapacity());

        engine1.setCapacity(4000);

        System.out.println("Car engine capacity after update: " + carReference.getEngine().getCapacity());



        System.out.println();

        // concatenation
        Car car2 = new Car(new Engine());
        car2.setName("Renault");
        car2.setFuelLevel(70);
        car2.setTotalTraveledDistance(100);

        car2.getEngine().setCapacity(2000);

        System.out.println("Properties of car " + car2.getName());
        System.out.println("Max speed: " + car2.getMaxSpeed());
        System.out.println("Fuel level: " + car2.getFuelLevel());
        System.out.println("Mileage: " + car2.getMileage());
        System.out.println("Total travel distance: " + car2.getTotalTraveledDistance());
        System.out.println("Damaged: " + car2.isDamaged());
        System.out.println("Door Count: " + car2.getDoorCount());
        System.out.println("Color: " + car2.getColor());
        System.out.println(car2);

        double distanceForCar1 = carReference.accelerate(60,1);

        double distanceForCar2 = car2.accelerate(100,1);

        System.out.println("Engine manufacturer before repair: " + carReference.getEngine().getManufacturer());
        Mechanic mechanic = new Mechanic();
        mechanic.repair(carReference);
        System.out.println("Engine manufacturer after repair: " + carReference.getEngine().getManufacturer());
        System.out.println("Initial name for car1 " + carReference.getName());

        carReference.setName("Audi");

        System.out.println("Initial name for car2 " + carReference.getName());

        carReference = new Car(engine1);
        System.out.println("Name of new car: " + carReference.getName());
        carReference.setName("BMW");

        carReference = car2;
        System.out.println("Name of car referenced from 2 variables. CarReference: " + carReference.getName());
        System.out.println("Name of car referenced from 2 variables. Car2: " + car2.getName());

        car2.setName("Dacia");

        System.out.println("Update name of car referenced from 2 variables. CarReference: " + carReference.getName());
        System.out.println("Update name of car referenced from 2 variables. Car2: " + car2.getName());


        car2 = null;
*/



    }
}
