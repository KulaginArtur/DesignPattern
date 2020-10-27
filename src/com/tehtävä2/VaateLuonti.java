package com.tehtävä2;

public abstract class VaateLuonti {

    protected abstract Vaate LuoVaate(String vaateMerkki);

    public Vaate tilaaVaate(String vaateMerkki) {
        Vaate vaate = LuoVaate(vaateMerkki);

        vaate.luoVaateet();

        return vaate;
    }
}
