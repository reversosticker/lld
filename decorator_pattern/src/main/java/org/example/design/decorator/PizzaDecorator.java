package org.example.design.decorator;

import org.example.design.Pizza;

public class PizzaDecorator implements Pizza {

    private Pizza pizza;
    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public void bake() {
        pizza.bake();
    }
}
