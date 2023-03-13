package org.example.abstracts;

import org.example.interfaces.Drive;

public abstract class Vehicle {
    //need to initialize abstract functionality

    protected Drive drive;
    public Vehicle(Drive drive){
        this.drive = drive;
    }
    public void driveVehicle(){
        System.out.println("Default Drive Execution");
    }
}
