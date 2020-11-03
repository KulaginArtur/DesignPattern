package com.tehtävä5;

public class Main {

    // tehtävä1 muunnettu rehtori Singleton luokaksi.
    // Koulussa voi olla vain yksi rehtori.

    public static void main(String[] args) {
        AterioivaOtus opettaja  = new Opettaja();
        AterioivaOtus rehtori   = Rehtori.getInstance();
        AterioivaOtus oppilas   = new Oppilas();

        opettaja.aterioi();
        rehtori.aterioi();
        oppilas.aterioi();
    }
}
