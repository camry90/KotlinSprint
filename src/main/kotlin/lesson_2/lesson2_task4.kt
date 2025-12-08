package org.example.lesson_2

const val BUFF = 20

fun main() {

    val minedCrystals = 7
    val minedIrons = 11

    val buffPercent = BUFF / 100.0

    val bonusBuffCrystals = (minedCrystals * buffPercent).toInt()
    val bonusBuffIrons = (minedIrons * buffPercent).toInt()

    println("Бонусная кристаллическая руда: $bonusBuffCrystals")
    println("Бонусное железная руда: $bonusBuffIrons")

}