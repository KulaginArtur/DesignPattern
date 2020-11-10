package com.tehtävä10;

public class Main {

    public static void main(String[] args){
        Chain chainWorker1 = new ImmediateSuperior();
        Chain chainWorker2 = new HeadOfUnit();
        Chain chainWorker3 = new CEO();

        chainWorker1.setNextChain(chainWorker2);
        chainWorker2.setNextChain(chainWorker3);

        Numbers request1 = new Numbers(5200, 7.0);
        Numbers request2 = new Numbers(6500, 4.0);
        Numbers request3 = new Numbers(7100, 2.0);

        chainWorker1.calculate(request1);
        chainWorker1.calculate(request2);
        chainWorker1.calculate(request3);
    }
}
