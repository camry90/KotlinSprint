package org.example.lesson_11

class CategoryRecipe(
    coverFood: Int,
    recipeList: List<Recipe>,
    bioFood: String,
)

class Recipe(
    coverFood: Int,
    recipeList: List<Ingredient>,
)

class Ingredient(
    portionsCount: Int,
    ingredientsList: List<String>,
    recipeManual: String
)
    