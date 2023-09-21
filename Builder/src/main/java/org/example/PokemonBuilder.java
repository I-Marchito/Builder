package org.example;

public class PokemonBuilder {
    private Pokemon pokemon;

    public PokemonBuilder(){
        pokemon = new Pokemon();
    }

    public Pokemon build(){
        if (pokemon.getNome().equals("")){
            throw new IllegalArgumentException("Pokemon sem nome");
        }
        if (pokemon.getTipo1().equals("")){
            if (pokemon.getTipo2() == null){
                throw new IllegalArgumentException("Pokemon sem tipo");
            }else{
                pokemon.setTipo1(pokemon.getTipo2());
                pokemon.setTipo2(null);
            }
        }
        if (pokemon.getBst() == 0){
            throw new IllegalArgumentException("Pokemon não possui Basic Stats Total (BST)");
        }
        return pokemon;
    }

    public PokemonBuilder setNome (String nome){
        pokemon.setNome(nome);
        return this;
    }

    public PokemonBuilder setTipo1 (String tipo1){
        pokemon.setTipo1(tipo1);
        return this;
    }

    public PokemonBuilder setTipo2 (String tipo2){
        pokemon.setTipo2(tipo2);
        return this;
    }

    public PokemonBuilder setBST (Integer bst){
        pokemon.setBst(bst);
        return this;
    }

    public PokemonBuilder setHp (int hp){
        pokemon.setHp(hp);
        return this;
    }

    public PokemonBuilder setAtk (int atk){
        pokemon.setAtk(atk);
        return this;
    }

    public PokemonBuilder setDef (int def){
        pokemon.setDef(def);
        return this;
    }
    public PokemonBuilder setSpAtk (int spAtk){
        pokemon.setSpAtk(spAtk);
        return this;
    }
    public PokemonBuilder setSpDef (int spDef){
        pokemon.setSpDef(spDef);
        return this;
    }
    public PokemonBuilder setSpeed (int speed){
        pokemon.setSpeed(speed);
        return this;
    }
}
