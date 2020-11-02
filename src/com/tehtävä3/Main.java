package com.tehtävä3;

public class Main {

    public static void main(String[] args) {

        // Creating the pc build
        PcComponent pcBuild     = new PcBuild("Build1", "build1");
        PcComponent mbBuild     = new PcBuild("Motherboard", "Motherboard with components");
        PcComponent caseBuild   = new PcBuild("Case", "Case with all components");

        // Creating all of the components
        PcComponent pross   = new Processor("Ryzen 5 3600", 220);
        PcComponent grCrd   = new GraphicsCard("GTX 1660", 260);
        PcComponent board   = new MotherBoard("B450", 125);
        PcComponent memory  = new Memory("HyperX", 80);
        PcComponent box     = new Case("P300", 60);
        PcComponent pSupply = new PowerSupply("CV650", 70);

        // Adding all motherboard components to the motherboard build
        mbBuild.addPcComponent(board);
        mbBuild.addPcComponent(pross);
        mbBuild.addPcComponent(grCrd);
        mbBuild.addPcComponent(memory);

        // Adding motherboard and power supply to the case
        caseBuild.addPcComponent(box);
        caseBuild.addPcComponent(mbBuild);
        caseBuild.addPcComponent(pSupply);

        // Adding all to a build
        pcBuild.addPcComponent(caseBuild);

        // Displaying all
        mbBuild.displayComponent();
        caseBuild.displayComponent();
        pcBuild.displayComponent();
    }
}
