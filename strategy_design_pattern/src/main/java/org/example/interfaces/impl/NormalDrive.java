package org.example.interfaces.impl;

import org.example.interfaces.Drive;

public class NormalDrive implements Drive {
    @Override
    public void driveVehicle() {
        System.out.println("Drive Normal Vehicle");
    }
}
