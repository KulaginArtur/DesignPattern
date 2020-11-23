package com.tehtävä14;

public class Burger implements BurgerPlan {

    private String burgerPatty;
    private String burgerSalad;


    public void setBurgerPatty(String patty) {
        burgerPatty = patty;
    }

    public String getBurgerPatty(){ return burgerPatty; }

    public void setBurgerSalad(String salad) {
        burgerSalad = salad;
    }

    public String getBurgerSalad(){ return burgerSalad; }

}
