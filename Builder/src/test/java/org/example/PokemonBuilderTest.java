package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonBuilderTest {

    @Test
    void deveRetornarExcecaoParaPokemonSemNome() {
        try {
            PokemonBuilder pokeBuilder = new PokemonBuilder();
            Pokemon pokemon = pokeBuilder
                    .setBST(340)
                    .setTipo1("Dark")
                    .setTipo2("Fire")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pokemon sem nome", e.getMessage());
        }
    }
    @Test
    void deveRetornarExcecaoParaPokemonSemTipo() {
        try {
            PokemonBuilder pokeBuilder = new PokemonBuilder();
            Pokemon pokemon = pokeBuilder
                    .setBST(340)
                    .setNome("Totodile")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pokemon sem tipo", e.getMessage());
        }
    }
    @Test
    void deveRetornarTipo2EmTipo1(){
        PokemonBuilder pokeBuilder = new PokemonBuilder();
        Pokemon pokemon = pokeBuilder
                .setNome("Totodile")
                .setBST(340)
                .setTipo2("Água")
                .build();

        assertEquals("Água", pokemon.getTipo1());
    }

    @Test
    void deveRetornarTipo2Nulo(){
        PokemonBuilder pokeBuilder = new PokemonBuilder();
        Pokemon pokemon = pokeBuilder
                .setNome("Totodile")
                .setBST(340)
                .setTipo2("Água")
                .build();

        assertNull(pokemon.getTipo2());
    }

    @Test
    void deveRetornarExcecaoParaPokemonSemBST() {
        try {
            PokemonBuilder pokeBuilder = new PokemonBuilder();
            Pokemon pokemon = pokeBuilder
                    .setNome("Growlithe")
                    .setTipo1("Fogo")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pokemon não possui Basic Stats Total (BST)", e.getMessage());
        }
    }

    @Test
    void deveRetornarPokemonValido(){
        PokemonBuilder pokeBuilder = new PokemonBuilder();
        Pokemon pokemon = pokeBuilder
                .setNome("Goodra")
                .setBST(600)
                .setTipo1("Dragão")
                .build();

        assertNotNull(pokemon);
    }

    @Test
    void deveRetornarPokemonValidoTipo2(){
        PokemonBuilder pokeBuilder = new PokemonBuilder();
        Pokemon pokemon = pokeBuilder
                .setNome("Goodra")
                .setBST(600)
                .setTipo2("Dragão")
                .build();

        assertNotNull(pokemon);
    }
}