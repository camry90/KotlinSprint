package org.example.lesson_5

const val GUESSED_THREE_NUMS = 3
const val GUESSED_TWO_NUMS = 2
const val GUESSED_ONE_NUM = 1

fun main() {

    fun randomNum() = (1..42).random()

    val winNumsList = listOf(randomNum(), randomNum(), randomNum())

    println("Введите первое число от 0 до 42: ")
    val answerNum1 = readln().toInt()
    println("Введите второе число от 0 до 42: ")
    val answerNum2 = readln().toInt()
    println("Введите третье число от 0 до 42: ")
    val answerNum3 = readln().toInt()

    val answerNumsList = listOf(answerNum1, answerNum2, answerNum3)
    val res = winNumsList.intersect(answerNumsList)

    if (res.size == GUESSED_THREE_NUMS) {
        println("Вы угадали все числа и выиграли джекпот!")
    } else if (res.size == GUESSED_TWO_NUMS) {
        println("Вы угадали два числа и выиграли крупный приз!")
    } else if (res.size == GUESSED_ONE_NUM) {
        println("Вы угадали одно число и получаете утешительный приз!")
    } else {
        println("Вы неугадали ни одно число и вы получаете ничего!")
    }

    println("Загаданные чилса: $winNumsList")

}