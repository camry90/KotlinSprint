package org.example.lesson_9

fun main() {

    val recipeOmelette = mutableListOf(
        2, 50, 15
    )

    println("Введите количество порций омлета: ")
    val userPortion = readln().toInt()

    val scaledPortion = recipeOmelette.map {
        it * userPortion
    }

    println(
        "На $userPortion порций вам понадобится:" +
                " Яиц - ${scaledPortion[0]} шт.," +
                " молока - ${scaledPortion[1]} мл.," +
                " сливочного масла - ${scaledPortion[2]} гр."
    )

}