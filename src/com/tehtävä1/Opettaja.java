package com.tehtävä1;

import com.tehtävä1.Ateriat.Pasta;
import com.tehtävä1.Ateriat.Vesi;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Vesi();
    }
    public Ruoka createRuoka() { return new Pasta(); }

}