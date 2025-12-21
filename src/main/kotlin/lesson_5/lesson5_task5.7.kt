package org.example.lesson_5

const val KM_IN_BLOCK = 100

fun main() {

    println("Введите расстояние поездки в км: ")
    val distanceTravel = readln().toDouble()
    println("Введите расход топлива на 100 км в  литрах: ")
    val expenseOil = readln().toDouble()
    println("Введите текущую цену за литр топлива: ")
    val currentOilCost = readln().toDouble()

    val allCountOil = (distanceTravel * expenseOil) / KM_IN_BLOCK
    val totalCostOil = allCountOil * currentOilCost

    println("Необходимо ${"%.2f".format(allCountOil)} литров топлива")
    println("Итоговая стоимость поездки ${"%.2f".format(totalCostOil)} рублей")

}