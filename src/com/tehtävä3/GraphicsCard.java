package com.tehtävä3;

public class GraphicsCard implements PcComponent {

    String name;
    int price;

    public GraphicsCard(String Name, int Price) {

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

        System.out.println("GraphicsCard: " + name + ", " + price);

    }
}
