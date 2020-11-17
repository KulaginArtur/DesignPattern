package com.tehtävä13;

public class Charmander implements PokemonState {
    Pokemon pokemon;

    EvolveVisitor evolver = new EvolveVisitor();

    public Charmander(Pokemon newPokemon){
        pokemon = newPokemon;
    }

    public void fight() {
        System.out.println("Charmander is Fighting");
        pokemon.pokemonLevel = pokemon.pokemonLevel + 5;
        if ( pokemon.pokemonLevel >= 16){
            pokemon.accept(evolver);
        }
    }

    public void eat() {
        System.out.println("Charmander is Eating");
        pokemon.pokemonLevel = pokemon.pokemonLevel + 1;
        if ( pokemon.pokemonLevel >= 16){
            pokemon.accept(evolver);
        }
    }

    public void rest() {
        System.out.println("Charmander is Resting");
        pokemon.pokemonLevel = pokemon.pokemonLevel + 2;
        if ( pokemon.pokemonLevel >= 16){
            pokemon.accept(evolver);
        }
    }

}