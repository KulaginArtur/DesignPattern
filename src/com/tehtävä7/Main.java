package com.tehtävä7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Pokemon pokemon = new Pokemon();
        boolean runLoop = true;

        while(runLoop){
            System.out.println("\nSelect");
            System.out.println("1. Fight");
            System.out.println("2. Eat");
            System.out.println("3. Rest");
            System.out.println("4. Show level");
            System.out.println("5. End the game");
            String ans = scanner.nextLine();

            switch (ans) {
                case "1" -> pokemon.fight();
                case "2" -> pokemon.eat();
                case "3" -> pokemon.rest();
                case "4" -> System.out.println("Level of pokemon: " + pokemon.pokemonLevel);
                case "5" -> runLoop = false;
            }
        }
    }
}
