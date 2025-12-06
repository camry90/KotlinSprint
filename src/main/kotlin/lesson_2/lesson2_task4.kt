package org.example.lesson_2

    const val BUFF = 0.2

fun main() {

    val minedCrystals = 7
    val minedIrons = 11

    val bonusBuffCrystals = (minedCrystals * BUFF).toInt()
    val bonusBuffIrons = (minedIrons * BUFF).toInt()

    println("Бонусная кристаллическая руда: $bonusBuffCrystals")
    println("Бонусное железная руда: $bonusBuffIrons")

}