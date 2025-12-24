package org.example.lesson_8

fun main() {
    val receiptBolognese = arrayOf(
        "паста", "говядина", "морковь",
        "томаты", "базилик", "перец", "вода"
    )

    println("Какой ингридиент вы хотите найти: ")
    val findIngredient = readln()
    var isFound = false

    for (i in receiptBolognese) {
        if (i == findIngredient) {
            isFound = true
            break
        }
    }

    if (isFound) {
        println("Ингредиент $findIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}