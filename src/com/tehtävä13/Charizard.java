package com.tehtävä13;

public class Charizard implements PokemonState {
    Pokemon pokemon;

    public Charizard(Pokemon newPokemon){
        pokemon = newPokemon;
    }

    public void fight() {
        System.out.println("Charizard is Fighting");
        pokemon.pokemonLevel = pokemon.pokemonLevel + 5;
    }

    public void eat() {
        System.out.println("Charizard is Eating");
        pokemon.pokemonLevel = pokemon.pokemonLevel + 2;
    }

    public void rest() {
        System.out.println("Charizard is Resting");
        pokemon.pokemonLevel = pokemon.pokemonLevel + 1;
    }
}
