package com.tehtävä8;

public class Main {

    public static void main(String[] args) {

        Game game1 = new Monopoly();
        Game game2 = new Chess();

        game1.playOneGame(4);
        game2.playOneGame(2);

    }
}
