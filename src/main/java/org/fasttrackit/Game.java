package org.fasttrackit;

import org.fasttrackit.competitor.Mobile;
import org.fasttrackit.utils.ScannerUtils;
import org.fasttrackit.competitor.vehicle.Car;
import org.fasttrackit.competitor.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;


public class Game {

    private Track[] tracks = new Track[3];
    private List<Mobile> competitors = new ArrayList<>();
    private Set<Mobile> outOfRaceCompetitors = new HashSet<>();

    private boolean winnerNotKnow = true;
    private Track selectedTrack;


    public void start() {
        System.out.println("Wolcome to the Racing Game!");

        initializeTrack();
        selectedTrack = getSelectedTrackFromUser();

        System.out.println("Sected track: " + selectedTrack.getName());

       initializeCompetitors();
       loopRounds();
    }

    private void loopRounds() {

        while (winnerNotKnow && outOfRaceCompetitors.size() < competitors.size()) {
            playOneRound();
        }

    }

    private void playOneRound() {
        System.out.println("New round.");

        for (Mobile competitor : competitors) {
            System.out.println("It's " + competitor.getName() + "'s turn.");

            if (!competitor.canMove()) {
                System.out.println("Sorry, you cannnot continue tha race...");
                outOfRaceCompetitors.add(competitor);
                continue;
            }
            double speed = getAccelerationSpeedFromUser();
            competitor.accelerate(speed,1);

            if (competitor.getTotalTraveledDistance() >= selectedTrack.getLength()){
                System.out.println("The winner is: " + competitor.getName());
                winnerNotKnow = false;
                break;
            }
        }
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
        System.out.println("Available tracks:");
        for (int i = 0; i < tracks.length; i++){
            if (tracks[i] !=null)
                System.out.println((i+1) +". " + tracks[i].getName() + ": " + tracks[i].getLength());
        }
    }

    private void initializeCompetitors() {
        int playerCount = getPlayerCountFromUser();

        for(int i = 1; i <= playerCount; i++) {
            System.out.println("Preparing player " + i + " for the race.");
            Vehicle vehicle = new Car();
            vehicle.setName(getVehicleNameFromUser());
            vehicle.setFuelLevel(30);
            vehicle.setMaxSpeed(300);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(8, 15));


            System.out.println("Fuel level for " + vehicle.getName() + ": " + vehicle.getFuelLevel());
            System.out.println("Max speed for " + vehicle.getName() + ": " + vehicle.getMaxSpeed());
            System.out.println("Mileage for " + vehicle.getName() + ": " + vehicle.getMileage());
            System.out.println();
            competitors.add(vehicle);
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

    private Track getSelectedTrackFromUser() {
        System.out.println("Please select a track:");
        int trackNumber = ScannerUtils.nextIntAndMoveToNextLine();
        return tracks[trackNumber - 1];
    }

    private  double getAccelerationSpeedFromUser() {
        System.out.println("Please enter acceleration speed:");
        return ScannerUtils.nextDoubleAndMoveToNextLine();
    }
}
