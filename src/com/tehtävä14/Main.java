package com.tehtävä14;

public class Main {

    public static void main(String[] args){

        BurgerBuilder hesBurger = new HesBurgerBuilder();
        BurgerEngineer burgerEngineer = new BurgerEngineer(hesBurger);

        burgerEngineer.makeBurger();

        Burger firstBurger = burgerEngineer.getBurger();

        System.out.println("Burger Built");
        System.out.println("Burger Patty Type: " + firstBurger.getBurgerPatty());
        System.out.println("Burger Salad Type: " + firstBurger.getBurgerSalad());

    }
}
