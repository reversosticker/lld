package org.example.design.decorator;

import org.example.design.Pizza;

public class TomatoPizza extends PizzaDecorator {

    public TomatoPizza(Pizza pizza){
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Adding tomato on pizza");
    }
}
