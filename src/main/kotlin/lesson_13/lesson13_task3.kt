package org.example.lesson_13

class PhoneDirectory2(
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

    val contactList = mutableListOf(
        PhoneDirectory2("Kyle", 89761231265, null),
        PhoneDirectory2("Lisa", 86714329871, "Yahoo"),
        PhoneDirectory2("Takaba", 89916723432, null),
        PhoneDirectory2("Ian", 89767776109, "null"),
        PhoneDirectory2("Mira", 89767776109, "Yandex"),
    )

    val companies = contactList.mapNotNull { it.company }
    companies.toSet()
    println(companies)

}