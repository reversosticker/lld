package org.example.abstracts.impl;

import org.example.abstracts.Vehicle;
import org.example.interfaces.impl.SpecialVehicle;

public class SportVehicle extends Vehicle {

    public SportVehicle() {
        super(new SpecialVehicle());
    }

    @Override
    public void driveVehicle(){
        System.out.println("Begin Sports Vehicle ");
        this.drive.driveVehicle();
        System.out.println("End Sports Vehicle ");
    }
}
