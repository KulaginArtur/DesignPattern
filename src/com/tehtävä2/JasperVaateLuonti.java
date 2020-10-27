package com.tehtävä2;

public class JasperVaateLuonti extends VaateLuonti {

    protected Vaate LuoVaate(String vaateMerkki) {
        Vaate vaate = null;

        if (vaateMerkki.equals("Adidas")){
            VaateTehdas vaateTehdas = new AdidasVaateTehdas();
            vaate = new AdidasVaate(vaateTehdas);
            vaate.setNimi("Adidas");

        } else

            if (vaateMerkki.equals("Boss")){
                VaateTehdas vaateTehdas = new BossVaateTehdas();
                vaate = new BossVaate(vaateTehdas);
                vaate.setNimi("Boss");

            }
            return vaate;

    }
}
