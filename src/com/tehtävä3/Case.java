package com.tehtävä3;

import java.util.ArrayList;
import java.util.List;

public class Case implements PcComponent {

    List<PcComponent> caseComponents = new ArrayList<>();

    String name;
    int price;

    public Case(String Name, int Price) {

        this.name   = Name;
        this.price  = Price;

    }

    public void addPcComponent(PcComponent newPcComponent) {
        caseComponents.add(newPcComponent);
    }

    public void removePcComponent(PcComponent newPcComponent) {
        caseComponents.remove(newPcComponent);
    }


    public void displayComponent() {

        System.out.println("Case: " + name + ", " + price);

    }
}
