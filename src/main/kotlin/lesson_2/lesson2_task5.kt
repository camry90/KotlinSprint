package org.example.lesson_2

import kotlin.math.pow

const val INTEREST_RATE = 0.167
const val INTEREST_YEAR = 20

fun main() {
    val deposit = 70000

    val totalAmount = deposit * (1 + INTEREST_RATE).pow(INTEREST_YEAR.toDouble())

    println("%.3f".format(totalAmount))

}