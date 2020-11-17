package com.tehtävä13;

public class EvolveVisitor implements Visitor {

    public EvolveVisitor() {

    }

    public void visit(Pokemon pokemon) {
        System.out.println("Pokemon is evolving");
        if (pokemon.pokemonState == pokemon.charmander) {
            pokemon.setPokemonState(pokemon.charmeleon);
        } else {
            pokemon.setPokemonState(pokemon.charizard);
        }

    }
}
