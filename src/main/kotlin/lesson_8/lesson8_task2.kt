package org.example.lesson_8

fun main() {
    val recipeBolognese = arrayOf(
        "паста", "говядина", "морковь",
        "томаты", "базилик", "перец", "вода"
    )

    println("Какой ингредиент вы хотите найти: ")
    val findIngredient = readln()

    for (i in recipeBolognese) {
        if (i == findIngredient) {
            println("Ингредиент $findIngredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")

}