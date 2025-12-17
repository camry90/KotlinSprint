package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val random = Random.Default
    val number1 = random.nextInt(11)
    val number2 = random.nextInt(11)

    println("Докажите, что вы не бот \n" +
            "Решите пример: $number1 + $number2")

    val answer = readln().toInt()
    val checkVerification = number1 + number2

    if (answer== checkVerification) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}