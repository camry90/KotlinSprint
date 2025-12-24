package org.example.lesson_7

fun main() {

    val lettersRange = 'a'..'z'
    val digitsRange = '0'..'9'
    var password = ""

    for (i in 1..3) {
        val letter = lettersRange.random()
        val digit = digitsRange.random()
        password += "$letter$digit"
    }

    println("Сгенерированный пароль: $password")

}