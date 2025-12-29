package org.example.lesson_10

fun randomDice(): Int = (1..6).random()

fun playRound(): Boolean {

    val userTurn = randomDice()
    val computerTurn = randomDice()

    println("Ход человека: $userTurn")
    println("Ход машины: $computerTurn")

    return when {
        userTurn > computerTurn -> {
            println("Победило человечество")
            true
        }

        userTurn < computerTurn -> {
            println("Победила машина")
            false
        }

        else -> {
            println("Победила дружба")
            false
        }
    }

}

fun main() {

    var userWins = 0
    do {
        if (playRound()) {
            userWins++
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val userChoice = readln()
    } while (userChoice.equals("Да", true))

    println("Выигрышных партий человека: $userWins")
}