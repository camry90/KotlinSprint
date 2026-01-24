package org.example.lesson_13

class PhoneDirectory4(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {

    fun printInfo() {
        println(
            "- Имя: ${name}\n" +
                    "- Номер телефона: ${phoneNumber}\n" +
                    "- Компания: ${company}\n"
        )
    }
}

fun main() {

    val contactList = mutableListOf<PhoneDirectory4>()

    do {

        println("Введите имя: ")
        val name = readln()
        println("Введите номер телефона: ")
        val phoneInput = readln()
        val phoneNumber = phoneInput.toLongOrNull()

        if (phoneNumber == null) {
            println("Вы не ввели номер телефона")
            continue
        }

        println("Введите компанию: ")
        val companyInput = readln()
        val company = companyInput.ifEmpty { null }

        contactList.add(PhoneDirectory4(name, phoneNumber, company))


    } while (contactList.size == 0)

    contactList.forEach { it.printInfo() }
}