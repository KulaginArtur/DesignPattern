package com.tehtävä13;

public class Charmeleon implements PokemonState {
    Pokemon pokemon;

    EvolveVisitor evolver = new EvolveVisitor();

    public Charmeleon(Pokemon newPokemon){
        pokemon = newPokemon;
    }

    public void fight() {
        System.out.println("Charmeleon is Fighting");
        pokemon.pokemonLevel = pokemon.pokemonLevel + 5;
        if ( pokemon.pokemonLevel >= 36){
            pokemon.accept(evolver);
        }
    }

    public void eat() {
        System.out.println("Charmeleon is Eating");
        pokemon.pokemonLevel = pokemon.pokemonLevel + 2;
        if ( pokemon.pokemonLevel >= 36){
            pokemon.accept(evolver);
        }
    }

    public void rest() {
        System.out.println("Charmeleon is Resting");
        pokemon.pokemonLevel = pokemon.pokemonLevel + 1;
        if ( pokemon.pokemonLevel >= 36){
            pokemon.accept(evolver);
        }
    }
}
