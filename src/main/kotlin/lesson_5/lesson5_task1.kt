package org.example.lesson_5

fun main() {

    println("Докажите, что вы не бот \n" +
            "Решите пример: 5 + 4")
    val answerVerification = readln().toInt()
    val checkVerification = 9

    if (answerVerification == checkVerification) {
        println("Добро пожаловать!")
    }else{
        println("Доступ запрещен.")
    }

}