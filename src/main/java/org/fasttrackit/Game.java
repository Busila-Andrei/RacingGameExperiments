package org.fasttrackit;

import org.fasttrackit.utils.ScannerUtils;
import org.fasttrackit.vehicles.Vehicle;


public class Game {

    private Track[] tracks = new Track[3];

    private Vehicle competitor1;
    private Vehicle competitor2;

    public void start() {
        System.out.println("Wolcome to the Racing Game!");

        initializeTrack();
        int playerCount = getPlayerCountFromUser();

        System.out.println("Player count: " + playerCount);

        String vehicleName = getVehicleNameFromUser();
        System.out.println("Vehicle name: " + vehicleName);
    }

    private void initializeTrack() {
        Track track1 = new Track();
        track1.setName("Highway");
        track1.setLength(200);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Street Circuit");
        track2.setLength(100);

        tracks[1] = track2;

        displayTracks();
    }

    public  void displayTracks() {
        for (int i = 0; i < tracks.length; i++){
            if (tracks[i] !=null)
                System.out.println((i+1) +". " + tracks[i].getName() + ": " + tracks[i].getLength());
        }
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
