package org.example.lesson_8

fun main() {

    val receiptBolognese = arrayOf(
        "паста", "говядина", "морковь",
        "томаты", "базилик", "перец", "вода"
    )

    println("Какой ингридиент вы хотите найти: ")
    val findIngredient = readln()
    val index = receiptBolognese.indexOf(findIngredient)

    if (index != -1) {
        println("Ингредиент $findIngredient есть в рецепте")
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}