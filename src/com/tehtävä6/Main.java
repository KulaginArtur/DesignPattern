package com.tehtävä6;

import com.tehtävä6.Ingredients.*;

public class Main {

    public static void main(String[] args) {

        Pizza Pizza1 = new Mozzarella(new TomatoSauce(new PlainPizza()));
        Pizza Pizza2 = new GrilledChicken(new Mozzarella(new BbgSauce(new PlainPizza())));
        Pizza Pizza3 = new Mozzarella(new Salad(new TomatoSauce(new PlainPizza())));

        System.out.println("\nAinesosat: " + Pizza1.getDescription() + "\nHinta: " + Pizza1.getCost() + "€");
        System.out.println("\nAinesosat: " + Pizza2.getDescription() + "\nHinta: " + Pizza2.getCost() + "€");
        System.out.println("\nAinesosat: " + Pizza3.getDescription() + "\nHinta: " + Pizza3.getCost() + "€");

    }
}
