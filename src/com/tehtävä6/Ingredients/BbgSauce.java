package com.tehtävä6.Ingredients;

import com.tehtävä6.Pizza;
import com.tehtävä6.ToppingDecorator;

public class BbgSauce extends ToppingDecorator {

    public BbgSauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Lisätään Taikina");
        System.out.println("Lisätään barbecuekastike");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Barbecuekastike";
    }

    public double getCost() {
        return tempPizza.getCost() + 1.25;
    }
}
