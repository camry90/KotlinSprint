package org.example.lesson_7

fun main() {

    val rangeCode = 1000..9999
    var randomCode: Int
    var userAuth: Int

    do {
        randomCode = rangeCode.random()
        println("Ваш код авторизации: $randomCode")
        println("Введите код авторизации: ")
        userAuth = readln().toInt()
        if (userAuth == randomCode) {
            println("Добро пожаловать!")
        }

    }while (randomCode != userAuth)

}