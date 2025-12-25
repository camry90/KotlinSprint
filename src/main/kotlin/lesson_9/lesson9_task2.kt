package org.example.lesson_9

fun main() {

    val recipeList = mutableListOf(
        "паста", "говядина", "томаты"
    )

    println("В рецепте есть базовые ингредиенты: $recipeList")
    println("Желаете добавить ещё?")
    val userAnswer = readln()

    if (userAnswer.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val userIngredient = readln()
        recipeList.add(userIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $recipeList")
    }

}