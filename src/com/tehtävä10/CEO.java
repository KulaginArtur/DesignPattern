package com.tehtävä10;

public class CEO implements Chain{

    private Chain nextInChain;

    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    public void calculate(Numbers request) {
        double pros = request.getNumber2() / 100 + 1.0;
        System.out.println("Vanha palkka: " + request.getNumber1() + "\nKorotus: " + request.getNumber2() + "%" +
                "\nUusi palkka: " + request.getNumber1() * pros + "\nT: TJ\n");
    }
}
