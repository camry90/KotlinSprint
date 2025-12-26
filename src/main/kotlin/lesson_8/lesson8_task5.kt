package org.example.lesson_8

fun main() {

    println("Введите количество ингредиентов: ")
    val countIngredients = readln().toInt()
    val ingredientsArray = Array(countIngredients) { "" }

    for (i in ingredientsArray.indices) {
        println("Введите ${i + 1} инредиент: ")
        ingredientsArray[i] = readln()
    }

    println(ingredientsArray.joinToString(", "))
}