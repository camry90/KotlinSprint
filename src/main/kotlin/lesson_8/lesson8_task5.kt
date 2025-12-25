package org.example.lesson_8

fun main() {

    println("Введите количество ингредиентов: ")
    val countIngredients = readln().toInt()
    val ingredientsArray = Array(countIngredients) { "" }


    for (i in 1..countIngredients) {
        println("Введите $i инредиент: ")
        ingredientsArray[i - 1] = readln()
    }

    println(ingredientsArray.joinToString(", "))
}