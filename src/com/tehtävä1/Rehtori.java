package com.tehtävä1;

import com.tehtävä1.Ateriat.Pasta;
import com.tehtävä1.Ateriat.Punaviini;

public class Rehtori extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Punaviini();
    }
    public Ruoka createRuoka() { return new Pasta(); }

}