package com.tehtävä7;

public class Pokemon {

    PokemonState charmander;
    PokemonState charmeleon;
    PokemonState charizard;

    PokemonState pokemonState;

    int pokemonLevel = 1;

    public Pokemon() {

        charmander  = new Charmander(this);
        charmeleon  = new Charmeleon(this);
        charizard   = new Charizard(this);

        pokemonState = charmander;
    }

    void setPokemonState(PokemonState newPokemonState) {
        pokemonState = newPokemonState;
    }
    void setPokemonLevel(int newPokemonLevel){
        pokemonLevel = newPokemonLevel;
    }

    public void fight() {
        pokemonState.fight();
    }
    public void rest() {
        pokemonState.rest();
    }
    public void eat() {
        pokemonState.eat();
    }
    private void evolve() {
        pokemonState.evolve();
    }

}
