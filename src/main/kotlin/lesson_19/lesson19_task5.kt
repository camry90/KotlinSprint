package org.example.lesson_19

const val HUMAN_COUNT = 5

class Human(val name: String, val gender: Gender)

enum class Gender(val id: Int) {

    MALE(1),
    FEMALE(2),
    NONE(0);
}

fun main() {

    val cardIndexData = buildList {

        println(
            """Инструкция:
            |1. Введите имя: "строка"
            |2. Введите пол: "1" - Мужской, "2" - Женский
        """.trimMargin()
        )
        repeat(HUMAN_COUNT) {
            println("Введите имя: ")
            val name = readln()
            println("Введите пол: ")
            val genderId = readln().toInt()
            val gender = when (genderId) {
                Gender.MALE.id -> Gender.MALE
                Gender.FEMALE.id -> Gender.FEMALE
                else -> Gender.NONE
            }
            add(Human(name, gender))
        }
    }

    cardIndexData.forEachIndexed { index, human ->
        println("${index + 1}) Имя: ${human.name}, Пол: ${human.gender}")
    }

}