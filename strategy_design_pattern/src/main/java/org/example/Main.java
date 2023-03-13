package org.example;

import org.example.abstracts.Vehicle;
import org.example.abstracts.impl.OnRoadVehicle;
import org.example.abstracts.impl.PassengerVehicle;
import org.example.abstracts.impl.SportVehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle onRoadVehicle =  new OnRoadVehicle();
        Vehicle passengerVehicle = new PassengerVehicle();
        Vehicle sportVehicle = new SportVehicle();

        //call all vehicle drive feature
        onRoadVehicle.driveVehicle();
        passengerVehicle.driveVehicle();
        sportVehicle.driveVehicle();
    }
}