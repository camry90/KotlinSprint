package org.example.lesson_2

import kotlin.math.pow

const val INTEREST_RATE = 16.7
const val INTEREST_YEAR = 20

fun main() {
    val deposit = 70000
    val interestRateKf = INTEREST_RATE / 100

    val totalAmount = deposit * (1 + interestRateKf).pow(INTEREST_YEAR.toDouble())

    println("%.3f".format(totalAmount))

}