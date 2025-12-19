package org.example.lesson_5

import kotlin.math.sqrt

const val CENTIMETERS_TO_METERS = 100
const val NOT_ENOUGH_BODY_MASS = 18.5
const val NORMAL_BODY_MASS = 25
const val EXTRA_BODY_MASS = 30

fun main() {

    println("Введите ваш вес в кг: ")
    val userWeight = readln().toDouble()
    println("Введите ваш рост в см: ")
    var userHeight = readln().toDouble()

    userHeight = userHeight / CENTIMETERS_TO_METERS

    val bmi = userWeight / (userHeight * userHeight)

    val bmiCategory = when {
        bmi < NOT_ENOUGH_BODY_MASS -> "Недостаточная масса тела"
        bmi < NORMAL_BODY_MASS -> "Нормальная масса тела"
        bmi < EXTRA_BODY_MASS -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    println("Ваш ИМТ - ${"%.2f".format(bmi)}. У вас $bmiCategory")

}