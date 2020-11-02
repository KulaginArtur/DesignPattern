package com.tehtävä3;

public class PowerSupply implements PcComponent {

    String name;
    int price;

    public PowerSupply(String Name, int Price) {

        this.name   = Name;
        this.price  = Price;

    }

    public void addPcComponent(PcComponent pcComponent) {

        throw new RuntimeException();

    }

    public void removePcComponent(PcComponent pcComponent) {

        throw new RuntimeException();

    }

    public void displayComponent() {

        System.out.println("Power supply: " + name + ", " + price);

    }
}
