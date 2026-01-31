package org.example.lesson_16

class Dice {

    private val randomNumber = (1..6).random()

    fun getNumber() {
        println(randomNumber)
    }
}

fun main() {

    val game1 = Dice()
    game1.getNumber()
}