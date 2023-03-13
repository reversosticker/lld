package org.example.abstracts.impl;

import org.example.abstracts.Vehicle;
import org.example.interfaces.impl.NormalDrive;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle(){
        super(new NormalDrive());
    }

    @Override
    public void driveVehicle() {
        System.out.println("Begin Passenger Vehicle ");
        this.drive.driveVehicle();
        System.out.println("End Passenger Vehicle ");
    }
}
