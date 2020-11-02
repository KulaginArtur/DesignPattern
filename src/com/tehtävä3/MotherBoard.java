package com.tehtävä3;

import java.util.ArrayList;
import java.util.List;

public class MotherBoard implements PcComponent {

    List<PcComponent> mbComponents = new ArrayList<>();

    String name;
    int price;

    public MotherBoard(String Name, int Price) {

        this.name   = Name;
        this.price  = Price;

    }

    public void addPcComponent(PcComponent newPcComponent) {
        mbComponents.add(newPcComponent);
    }

    public void removePcComponent(PcComponent newPcComponent) {
        mbComponents.remove(newPcComponent);
    }

    public void displayComponent() {

        System.out.println("MotherBoard: " + name + ", " + price);

    }
}
