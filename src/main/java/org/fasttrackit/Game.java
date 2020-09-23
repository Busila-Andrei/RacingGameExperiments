package org.fasttrackit;

import org.fasttrackit.utils.ScannerUtils;
import org.fasttrackit.vehicles.Vehicle;


public class Game {

    private Vehicle competitor1;
    private Vehicle competitor2;

    public void start() {
        System.out.println("Wolcome to the Racing Game!");
        int playerCount = getPlayerCountFromUser();

        System.out.println("Player count: " + playerCount);

        String vehicleName = getVehicleNameFromUser();
        System.out.println("Vehicle name: " + vehicleName);
    }

    private int getPlayerCountFromUser() {
        System.out.println("Please enter number of players:");
        return ScannerUtils.nextIntAndMoveToNextLine();
    }

    private String getVehicleNameFromUser() {
        System.out.println("Please unter vehicle name:");
        return ScannerUtils.nextLine();
    }
}
