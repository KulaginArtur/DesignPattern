package com.tehtävä3;

public class Processor implements PcComponent {

    String name;
    int price;

    public Processor(String Name, int Price) {

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

        System.out.println("Processor: " + name + ", " + price);

    }
}
