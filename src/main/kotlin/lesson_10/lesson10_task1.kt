package org.example.lesson_10

fun rollDice(): Int = (1..6).random()

fun main() {

    println("Ход игрока")
    val personTurn = rollDice()
    println("Выпало число $personTurn")

    println("Ход компьютера")
    val computerTurn = rollDice()
    println("Выпало число $computerTurn")

    if (personTurn > computerTurn) {
        println("Победило человечество")
    } else if (personTurn < computerTurn) {
        println("Победила машина")
    } else {
        println("Победила дружба")
    }

}