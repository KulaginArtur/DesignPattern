package com.tehtävä5;

import com.tehtävä5.Ateriat.Pasta;
import com.tehtävä5.Ateriat.Punaviini;

public class Rehtori extends AterioivaOtus {

    private static Rehtori firstInstace = null;

    private Rehtori() {}

    public static Rehtori getInstance() {

        if (firstInstace == null) {
            firstInstace = new Rehtori();
        }
        return firstInstace;
    }

    public Juoma createJuoma(){
        return new Punaviini();
    }
    public Ruoka createRuoka() { return new Pasta(); }

}