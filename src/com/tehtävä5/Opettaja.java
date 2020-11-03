package com.tehtävä5;

import com.tehtävä5.Ateriat.Pasta;
import com.tehtävä5.Ateriat.Vesi;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Vesi();
    }
    public Ruoka createRuoka() { return new Pasta(); }

}