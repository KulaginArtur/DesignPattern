package com.tehtävä6.Ingredients;

import com.tehtävä6.Pizza;
import com.tehtävä6.ToppingDecorator;

public class GrilledChicken extends ToppingDecorator {

    public GrilledChicken(Pizza newPizza) {
        super(newPizza);

        System.out.println("Lisätään Pariloitu kana");

    }

    public String getDescription() {

        return tempPizza.getDescription() + ", Pariloitu kana";

    }

    public double getCost() {

        return tempPizza.getCost() + 2.50;
    }
}
