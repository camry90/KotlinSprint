package org.example.lesson_13

class PhoneBookEntry2(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {

    val contactList = listOf(
        PhoneBookEntry2("Kyle", 89761231265, null),
        PhoneBookEntry2("Lisa", 86714329871, "Yahoo"),
        PhoneBookEntry2("Takaba", 89916723432, null),
        PhoneBookEntry2("Ian", 89767776109, "null"),
        PhoneBookEntry2("Mira", 89767776109, "Yahoo"),
    )

    val companies = contactList.mapNotNull { it.company }.toSet()
    println(companies)

}