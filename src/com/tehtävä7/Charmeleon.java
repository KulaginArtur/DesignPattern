package com.tehtävä7;

public class Charmeleon implements PokemonState {
    Pokemon pokemon;

    public Charmeleon(Pokemon newPokemon){
        pokemon = newPokemon;
    }

    public void fight() {
        System.out.println("Charmeleon is Fighting");
        pokemon.pokemonLevel = pokemon.pokemonLevel + 5;
        if ( pokemon.pokemonLevel >= 36){
            evolve();
        }
    }

    public void eat() {
        System.out.println("Charmeleon is Eating");
        pokemon.pokemonLevel = pokemon.pokemonLevel + 2;
        if ( pokemon.pokemonLevel >= 36){
            evolve();
        }
    }

    public void rest() {
        System.out.println("Charmeleon is Resting");
        pokemon.pokemonLevel = pokemon.pokemonLevel + 1;
        if ( pokemon.pokemonLevel >= 36){
            evolve();
        }
    }

    public void evolve() {
        System.out.println("Charmeleon is Evolving");
        pokemon.setPokemonState(pokemon.charizard);

    }
}
