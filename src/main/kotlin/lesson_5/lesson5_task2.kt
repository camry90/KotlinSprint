package org.example.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    println("Введите свой год рождения: ")
    val userYearOfBirth = readln().toInt()
    val currentYear = 2025

    if ((currentYear - userYearOfBirth) >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом.")
    }else {
        println("Доступ запрещен.")
    }

}