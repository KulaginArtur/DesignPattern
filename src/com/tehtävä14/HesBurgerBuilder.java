package com.tehtävä14;

public class HesBurgerBuilder implements BurgerBuilder {

    private Burger burger;

    public HesBurgerBuilder(){
        this.burger = new Burger();
    }

    public void makeBurgerPatty() {
        burger.setBurgerPatty("Beef Patty");
    }

    public void makeBurgerSalad() {
        burger.setBurgerSalad("Salad");
    }

    public Burger getBurger() {
        return this.burger;
    }
}
