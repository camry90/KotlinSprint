package org.example.lesson_16

class User3(
    val login: String,
    private val password: String,
) {

    fun checkPassword(inputPassword: String): Boolean = inputPassword == password
}

fun main() {

    val user1 = User3("Kasss", "iooo")

    println("Введите пароль: ")
    val input = readln()
    println(user1.checkPassword(input))
}