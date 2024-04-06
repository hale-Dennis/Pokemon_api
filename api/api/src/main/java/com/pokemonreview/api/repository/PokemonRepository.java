package com.pokemonreview.api.repository;

import com.pokemonreview.api.modules.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

}

