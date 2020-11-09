package com.tehtävä7;

public class Charmander implements PokemonState {
    Pokemon pokemon;

    public Charmander(Pokemon newPokemon){
        pokemon = newPokemon;
    }

    public void fight() {
        System.out.println("Charmander is Fighting");
        pokemon.pokemonLevel = pokemon.pokemonLevel + 5;
        if ( pokemon.pokemonLevel >= 16){
            evolve();
        }
    }

    public void eat() {
        System.out.println("Charmander is Eating");
        pokemon.pokemonLevel = pokemon.pokemonLevel + 1;
        if ( pokemon.pokemonLevel >= 16){
            evolve();
        }
    }

    public void rest() {
        System.out.println("Charmander is Resting");
        pokemon.pokemonLevel = pokemon.pokemonLevel + 2;
        if ( pokemon.pokemonLevel >= 16){
            evolve();
        }
    }

    public void evolve() {
        System.out.println("Charmander is Evolving");
        pokemon.setPokemonState(pokemon.charmeleon);
    }
}
