package com.tehtävä6.Ingredients;

import com.tehtävä6.Pizza;
import com.tehtävä6.ToppingDecorator;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Lisätään Taikina");
        System.out.println("Lisätään Tomaattikastike");

    }

    public String getDescription() {

        return tempPizza.getDescription() + ", Tomaattikastike";

    }

    public double getCost() {

        return tempPizza.getCost() + 1.25;
    }
}
