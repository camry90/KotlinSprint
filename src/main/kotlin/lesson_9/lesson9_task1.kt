package org.example.lesson_9

fun main() {

    val recipeList = listOf(
        "паста", "говядина", "томаты", "перец"
    )

    println(recipeList)

    recipeList.forEach {
        println(it)
    }
}