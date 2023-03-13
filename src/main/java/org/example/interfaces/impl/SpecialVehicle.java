package org.example.interfaces.impl;

import org.example.interfaces.Drive;

public class SpecialVehicle implements Drive {

    @Override
    public void driveVehicle() {
        System.out.println("Drive SpecialVehicle");
    }
}
