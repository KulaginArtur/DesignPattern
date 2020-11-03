package com.tehtävä6.Ingredients;

import com.tehtävä6.Pizza;
import com.tehtävä6.ToppingDecorator;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Lisätään Motsarella");

    }

    public String getDescription() {

        return tempPizza.getDescription() + ", Motsarella";

    }

    public double getCost() {

        return tempPizza.getCost() + 2.50;
    }
}
