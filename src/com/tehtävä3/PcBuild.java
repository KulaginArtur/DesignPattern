package com.tehtävä3;

import java.util.ArrayList;
import java.util.List;

public class PcBuild implements PcComponent {

    List<PcComponent> pcComponents = new ArrayList<>();

    String buildName;
    String buildDescription;

    public PcBuild(String newBuildName, String newBuildDescription){

        buildName           = newBuildName;
        buildDescription    = newBuildDescription;

    }

    public String getBuildName() { return buildName; }
    public String getBuildDescription() { return buildDescription; }

    public void addPcComponent(PcComponent newPcComponent) {
        pcComponents.add(newPcComponent);
    }

    public void removePcComponent(PcComponent newPcComponent) {
        pcComponents.remove(newPcComponent);
    }

    public void displayComponent() {
        System.out.println("\nName: " + buildName + ", Description: " + buildDescription + "\nComponents: ");
        for(PcComponent p: pcComponents) {
            p.displayComponent();
        }
    }
}
