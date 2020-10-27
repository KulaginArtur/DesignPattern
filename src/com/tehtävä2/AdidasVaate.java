package com.tehtävä2;

public class AdidasVaate extends Vaate{

    VaateTehdas vaateTehdas;

    public AdidasVaate(VaateTehdas vaateTehdas) {
        this.vaateTehdas = vaateTehdas;
    }

    void luoVaateet() {

        System.out.println("Luodaan " + getNimi() + " vaatteita");

        housut  = vaateTehdas.createHousut();
        paita   = vaateTehdas.createPaita();
        paahine = vaateTehdas.createPaahine();
        kengat  = vaateTehdas.createKengat();

        System.out.println("Jasperilla on päällä: \n"+ housut + paita + paahine + kengat + "\n");
    }
}
