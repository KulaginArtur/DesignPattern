package com.tehtävä2;

import com.tehtävä2.Asusteet.BossAsusteet.BossHousut;
import com.tehtävä2.Asusteet.BossAsusteet.BossKengat;
import com.tehtävä2.Asusteet.BossAsusteet.BossPaahine;
import com.tehtävä2.Asusteet.BossAsusteet.BossPaita;
import com.tehtävä2.Asusteet.Housut;
import com.tehtävä2.Asusteet.Kengat;
import com.tehtävä2.Asusteet.Paahine;
import com.tehtävä2.Asusteet.Paita;

public class BossVaateTehdas implements VaateTehdas{

    public Housut createHousut() {
        return new BossHousut();
    }
    public Paita createPaita() {
        return new BossPaita();
    }
    public Paahine createPaahine() {
        return new BossPaahine();
    }
    public Kengat createKengat() {
        return new BossKengat();
    }
}
