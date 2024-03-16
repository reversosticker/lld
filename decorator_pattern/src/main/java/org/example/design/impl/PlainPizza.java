package org.example.design.impl;

import org.example.design.Pizza;

public class PlainPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Preparing plain pizza ");
    }
}
