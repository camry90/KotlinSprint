package org.example.lesson_13

class PhoneBookEntry4(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {

    println("Введите номер телефона: ")
    val phoneInput = readln()

    try {
        val contact1 = PhoneBookEntry4("Kyle", phoneInput.toLong(), null)
        println("Номер телефона: ${contact1.phoneNumber}")
    } catch (e: Exception) {
        println("Ошибка поймана: ${e::class.simpleName}")
    }

}
