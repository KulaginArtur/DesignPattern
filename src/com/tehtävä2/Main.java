package com.tehtävä2;

public class Main {

    public static void main(String[] args) {

        VaateLuonti LuoVaateita = new JasperVaateLuonti();

        Vaate adidas = LuoVaateita.tilaaVaate("Adidas");
        Vaate boss   = LuoVaateita.tilaaVaate("Boss");
    }
}
