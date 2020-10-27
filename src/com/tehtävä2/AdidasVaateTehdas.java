package com.tehtävä2;

import com.tehtävä2.Asusteet.AdidasAsusteet.AdidasHousut;
import com.tehtävä2.Asusteet.AdidasAsusteet.AdidasKengat;
import com.tehtävä2.Asusteet.AdidasAsusteet.AdidasPaahine;
import com.tehtävä2.Asusteet.AdidasAsusteet.AdidasPaita;
import com.tehtävä2.Asusteet.Housut;
import com.tehtävä2.Asusteet.Kengat;
import com.tehtävä2.Asusteet.Paahine;
import com.tehtävä2.Asusteet.Paita;

public class AdidasVaateTehdas implements VaateTehdas{

    public Housut createHousut() {
        return new AdidasHousut();
    }
    public Paita createPaita() {
        return new AdidasPaita();
    }
    public Paahine createPaahine() {
        return new AdidasPaahine();
    }
    public Kengat createKengat() {
        return new AdidasKengat();
    }
}
