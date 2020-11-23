package com.tehtävä14;

public class BurgerEngineer {

    private BurgerBuilder burgerBuilder;

    public BurgerEngineer(BurgerBuilder burgerBuilder){
        this.burgerBuilder = burgerBuilder;
    }

    public Burger getBurger(){
        return this.burgerBuilder.getBurger();
    }

    public void makeBurger() {
        this.burgerBuilder.makeBurgerPatty();
        this.burgerBuilder.makeBurgerSalad();
    }
}
