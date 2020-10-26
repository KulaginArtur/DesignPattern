package com.tehtävä1;

import com.tehtävä1.Ateriat.Olut;
import com.tehtävä1.Ateriat.Siivet;

public class Oppilas extends AterioivaOtus {

    public Juoma createJuoma() {
        return new Olut();
    }
    public Ruoka createRuoka() { return new Siivet(); }

}