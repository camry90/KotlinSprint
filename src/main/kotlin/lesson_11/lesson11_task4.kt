package org.example.lesson_11

class CategoryRecipe(
    coverFood: Int,
    recipeList: List<Recipe>,
    bioFood: String,
)

class Recipe(
    coverFood: Int,
    ingredientsList: List<Ingredient>,
)

class Ingredient(
    portionsCount: Int,
    recipeManual: String
)
    