package org.example.lesson_10

const val JSON_TOKEN_LENGTH = 32
const val USER_LOGIN_ONE = "Octopus"
const val USER_PASSWORD_ONE = "oct888"

fun tokenGenerator(): String {

    val digits = '0'..'9'
    val upperLetters = 'A'..'Z'
    val letters = 'a'..'z'
    val allChars = digits + upperLetters + letters
    var userToken = ""

    for (i in 1..JSON_TOKEN_LENGTH) {
        userToken += allChars.random()
    }
    return userToken
}

fun signIn(login: String, password: String): String? {

    return if (login.equals(USER_LOGIN_ONE) && password.equals(USER_PASSWORD_ONE)) {
        tokenGenerator()
    } else {
        null
    }
}

fun getBasket(token: String?): List<String>? {

    return if (token != null) {
        listOf("Нашники", "Павербанк", "Ночник")
    } else {
        null
    }
}


fun main() {

    println("Введите логин: ")
    val login = readln()
    println("Введите пароль: ")
    val password = readln()

    val token = signIn(login, password)
    val userBasket = getBasket(token)
    if (userBasket != null) {
        println("Авторизация прошла успешно! Вот список товаров в корзине: $userBasket")
    } else {
        println("Авторизация не пройдена!")
    }
}
