package com.tehtävä6.Ingredients;

import com.tehtävä6.Pizza;
import com.tehtävä6.ToppingDecorator;

public class Salad extends ToppingDecorator {

    public Salad(Pizza newPizza) {
        super(newPizza);

        System.out.println("Lisätään Salaatti");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Salaatti";
    }

    public double getCost() {
        return tempPizza.getCost() + 2.50;
    }
}
