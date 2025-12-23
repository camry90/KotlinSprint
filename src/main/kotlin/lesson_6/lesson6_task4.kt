package org.example.lesson_6


fun main() {

    val randomNumber = (1..9).random()
    var tryCounts = 5
    var guessNumber: Int

    while (tryCounts > 0) {
        println("Угадайте число от 1 до 9: ")
        guessNumber = readln().toInt()
        if (guessNumber == randomNumber) {
            println("Это была великолепная игра!")
            tryCounts = 0
        } else {
            tryCounts--
            println("Неверно! У вас осталось $tryCounts попыток")
        }
    }

    println("Было загадано число $randomNumber")
}
