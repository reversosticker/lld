package org.example;

import org.example.design.decorator.TomatoPizza;
import org.example.design.decorator.VeggiePizza;
import org.example.design.impl.PlainPizza;

public class DecoratorPatternMain {

    public static void main(String[] args) {
         TomatoPizza tomatoPizza = new TomatoPizza(new PlainPizza());
         tomatoPizza.bake();

        VeggiePizza veggiePizza = new VeggiePizza(new TomatoPizza(new PlainPizza()));
        veggiePizza.bake();
    }

}