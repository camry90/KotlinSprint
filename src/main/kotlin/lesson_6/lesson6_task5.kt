package org.example.lesson_6

fun main() {

    var tryCount = 3
    var randomNumber1: Int
    var randomNumber2: Int
    var answer: Int
    var userAnswer: Int
    println("\t\tРегистрация аккаунта")
    println("Логин: ")
    val loginSignUp = readln()
    println("Пароль: ")
    val passwordSignUp = readln()


    println("\t\tВойти в аккаунт")
    do {
        println("Логин: ")
        val loginSignIn = readln()
        println("Пароль: ")
        val passwordSignIn = readln()
    } while (loginSignUp != loginSignIn || passwordSignUp != passwordSignIn)

    println("Авторизация прошла успешно!")
    println("Докажите, что вы не бот")

    while (tryCount > 0) {
        randomNumber1 = (1..9).random()
        randomNumber2 = (1..9).random()
        answer = randomNumber1 + randomNumber2
        println("$randomNumber1 + $randomNumber2")
        userAnswer = readln().toInt()
        if (userAnswer == answer) {
            println("Добро пожаловать!")
            tryCount = 0
        } else {
            tryCount--
            println("Неверно! Осталось $tryCount попыток")
            if (tryCount == 0) {
                println("Доступ запрещён!")
            }
        }
    }

}