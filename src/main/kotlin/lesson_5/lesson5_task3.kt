package org.example.lesson_5

fun main() {

    val correctNumber1 = 31
    val correctNumber2 = 2

    println("Угадайте два числа от 0 до 42!\n" +
            "Введите первое число: ")
    val answerNumber1 = readln().toInt()
    println("Введите второе число: ")
    val answerNumber2 = readln().toInt()

    val win =
        (answerNumber1 == correctNumber1 && answerNumber2 == correctNumber2) ||
                (answerNumber2 == correctNumber1 && answerNumber1 == correctNumber2)

    val niceTry = (answerNumber1 == correctNumber1 || answerNumber1 == correctNumber2 ||
            answerNumber2 == correctNumber1 || answerNumber2 == correctNumber2) && !win

    when {
        win -> println("Поздравляем! Вы выиграли главный приз!")
        niceTry -> println("Вы выиграли утешительный приз!\n" +
                "Числа для победы: $correctNumber1 и $correctNumber2")
        else -> println("Неудача!\n" +
                "Числа для победы: $correctNumber1 и $correctNumber2")
    }

}