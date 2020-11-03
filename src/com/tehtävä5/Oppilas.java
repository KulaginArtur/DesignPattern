package com.tehtävä5;

import com.tehtävä5.Ateriat.Olut;
import com.tehtävä5.Ateriat.Siivet;

public class Oppilas extends AterioivaOtus {

    public Juoma createJuoma() {
        return new Olut();
    }
    public Ruoka createRuoka() { return new Siivet(); }

}