package com.it.spa.tacocloud.Repository;

import com.it.spa.tacocloud.Entity.Ingredient;

import java.util.Optional;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
