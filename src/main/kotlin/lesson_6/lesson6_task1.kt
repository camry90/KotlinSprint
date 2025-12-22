package org.example.lesson_6

fun main() {

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

}