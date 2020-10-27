package com.tehtävä2;

import com.tehtävä2.Asusteet.Housut;
import com.tehtävä2.Asusteet.Kengat;
import com.tehtävä2.Asusteet.Paahine;
import com.tehtävä2.Asusteet.Paita;

public abstract class Vaate {

    private String nimi;

    Housut housut;
    Paita paita;
    Paahine paahine;
    Kengat kengat;

    public String getNimi() { return nimi; }
    public void setNimi(String newNimi) { nimi = newNimi; }

    abstract void luoVaateet();

}
