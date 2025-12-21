package org.example.lesson_5

const val GUESSED_THREE_NUMS = 3
const val GUESSED_TWO_NUMS = 2
const val GUESSED_ONE_NUM = 1
const val PICKS_COUNT = 3

fun main() {

    fun randomNum() = (0..42).random()

    val winNumsList = listOf(randomNum(), randomNum(), randomNum())

    val answerNumsList = List(PICKS_COUNT) { i ->
        println("Введите число № ${i + 1} от 0 до 42: ")
        readln().toInt()
    }

    val matchesCount = winNumsList.intersect(answerNumsList)

    when (matchesCount.size) {
        GUESSED_THREE_NUMS -> println("Вы угадали все числа и выиграли джекпот!")
        GUESSED_TWO_NUMS -> println("Вы угадалии два числа и выиграли крупный приз!")
        GUESSED_ONE_NUM -> println("Вы угадали одно число и выиграли утешительный приз!")
        else -> println("Вы не угадали ни одного числа")
    }

    println("Загаданные чилса: $winNumsList")
}