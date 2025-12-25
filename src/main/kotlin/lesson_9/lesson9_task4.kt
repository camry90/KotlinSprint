package org.example.lesson_9

fun main() {

    println("Введите 5 ингредиентов через запятую: ")
    val userStr = readln()

    val ingredients = userStr.split(", ")

    val sortedIngredients = ingredients.sorted()
    println(sortedIngredients)

}