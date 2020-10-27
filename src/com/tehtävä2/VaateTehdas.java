package com.tehtävä2;

import com.tehtävä2.Asusteet.Housut;
import com.tehtävä2.Asusteet.Kengat;
import com.tehtävä2.Asusteet.Paahine;
import com.tehtävä2.Asusteet.Paita;

public interface VaateTehdas {

     Housut createHousut();
     Paita createPaita();
     Paahine createPaahine();
     Kengat createKengat();
}
