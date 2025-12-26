package org.example.lesson_10

const val MIN_LENGTH = 4

fun lengthValid(input: String) = input.length >= MIN_LENGTH

fun main() {

    println("Введите логин: ")
    val userLogin = readln()
    println("Введите пароль: ")
    val userPassword = readln()

    when (lengthValid(userLogin) && lengthValid(userPassword)) {
        true -> println("Добро пожаловать!")
        else -> println("Логин или пароль недостаточно длинные")
    }
}