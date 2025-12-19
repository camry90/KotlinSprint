package org.example.lesson_5



fun main() {

    val number1 = (0..10).random()
    val number2 = (0..10).random()

    println(
        "Докажите, что вы не бот \n" +
                "Решите пример: $number1 + $number2"
    )

    val answer = readln().toInt()
    val checkVerification = number1 + number2

    if (answer == checkVerification) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}