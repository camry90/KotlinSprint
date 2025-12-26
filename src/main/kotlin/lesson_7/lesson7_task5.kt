package org.example.lesson_7

const val MIN_PASSWORD_SIZE = 6

fun main() {

    val lowercaseLetters = 'a'..'z'
    val uppercaseLetters = 'A'..'Z'
    val digits = '0'..'9'
    val allChars = digits + lowercaseLetters + uppercaseLetters
    var passwordLength: Int

    do {
        println("Введите длину пароля (минимум $MIN_PASSWORD_SIZE символов): ")
        passwordLength = readln().toInt()
    } while (passwordLength <= MIN_PASSWORD_SIZE)

    val passwordList = mutableListOf(
        lowercaseLetters.random(),
        uppercaseLetters.random(),
        digits.random()
    )
    val countSymbols = passwordLength - passwordList.size

    for (i in 1..countSymbols) {
        passwordList.add(allChars.random())
    }

    passwordList.shuffle()
    println("Ваш пароль: $passwordList")

}