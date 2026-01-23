package org.example.lesson_13

class PhoneDirectory1(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {

    fun printInfo() {
        println(
            "- Имя: ${name}\n" +
                    "- Номер телефона: ${phoneNumber}\n" +
                    "- Компания: ${company ?: "<не указано>"}\n"
        )
    }
}

fun main() {

    val contact1 = PhoneDirectory1("Tolya", 87651658998, null)
    contact1.printInfo()
    val contact2 = PhoneDirectory1("Rombik", 89993275513, "Google")
    contact2.printInfo()
}