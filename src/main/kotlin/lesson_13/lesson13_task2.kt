package org.example.lesson_13

class PhoneBookEntry(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {

    fun printInfo() {
        println(
            "-Имя: $name\n-Номер телефона: $phoneNumber\n-Компания: ${company ?: "<не указано>"}\n"
        )
    }
}

fun main() {

    val contact1 = PhoneBookEntry("Tolya", 87651658998)
    contact1.printInfo()
    val contact2 = PhoneBookEntry("Rombik", 89993275513, "Google")
    contact2.printInfo()
}