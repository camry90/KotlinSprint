package org.example.lesson_20

class Robot {

    val phrases = listOf(
        "Я робот",
        "Все чётко",
        "Сегодня хорошая погода",
        "У лукоморья дуб зеленый",
        "Гребу деньги лопатой",
    )

    private var modifier: (String) -> String = { it }

    fun say() {
        val phrase = phrases.random()
        println(modifier(phrase))
    }

    fun setModifier(newModifier: (String) -> String) {
        modifier = newModifier
    }
}

fun main() {


    val invertModifier = { phrase: String ->
        phrase.split(" ").reversed().joinToString(" ")
    }

    val robot = Robot()
    robot.say()
    robot.setModifier(invertModifier)
    robot.say()
}