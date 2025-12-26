package org.example.lesson_9

const val COUNT_INGREDIENTS = 5

fun main() {

    val ingredientList = mutableListOf<String>()

    for (i in 1..COUNT_INGREDIENTS) {
        println("Введите $i ингредиент: ")
        val userIngredient = readln()
        ingredientList.add(userIngredient)
    }

    val sortedIngredientList = ingredientList
        .toSet()
        .sorted()
        .joinToString(", ")
        .replaceFirstChar { it.uppercaseChar() }

    println(sortedIngredientList)

}