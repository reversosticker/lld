package org.example.design.decorator;

import org.example.design.Pizza;

public class VeggiePizza extends PizzaDecorator {

    public VeggiePizza(Pizza pizza){
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Adding Veggie on pizza");
    }
}
