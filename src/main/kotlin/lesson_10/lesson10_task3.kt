package org.example.lesson_10

fun randomPassword(length: Int): String {
    val numbers = "0123456789"
    val specialSymbols = "!\"#$%&'()*+,-./"
    var password = ""

    for (i in 1..length) {
        password += if (i % 2 == 0) {
            numbers.random()
        } else {
            specialSymbols.random()
        }
    }

    return password
}

fun main() {

    println("Введите длину пароля: ")
    val userLength = readln().toInt()
    val userPassword = randomPassword(userLength)

    println(userPassword)

}