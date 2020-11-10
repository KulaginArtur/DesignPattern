package com.tehtävä10;

public class HeadOfUnit implements Chain{

    private Chain nextInChain;

    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    public void calculate(Numbers request) {
        double pros = request.getNumber2() / 100 + 1.0;
        if (request.getNumber2() <= 5){
            System.out.println("Vanha palkka: " + request.getNumber1() + "\nKorotus: " + request.getNumber2() + "%" +
                    "\nUusi palkka: " + request.getNumber1() * pros + "\nT: Yksikön päälikkö\n");
        } else {
            nextInChain.calculate(request);
        }
    }
}
