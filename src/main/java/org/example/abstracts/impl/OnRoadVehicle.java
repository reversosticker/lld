package org.example.abstracts.impl;

import org.example.abstracts.Vehicle;
import org.example.interfaces.impl.NormalDrive;

public class OnRoadVehicle extends Vehicle {

    public OnRoadVehicle() {
        super(new NormalDrive());
    }


    @Override
    public void driveVehicle() {
        System.out.println("Begin OnRoadVehicle Drive");
        drive.driveVehicle();
        System.out.println("End OnRoadVehicle Drive");
    }
}
