package com.tehtävä6.Ingredients;

import com.tehtävä6.Pizza;

public class PlainPizza implements Pizza {

    public String getDescription() {
        return "Taikina";
    }

    public double getCost() {
        return 5.00;
    }
}
