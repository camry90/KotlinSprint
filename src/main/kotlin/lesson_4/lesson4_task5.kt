package org.example.lesson_4

const val MIN_PERSONAL = 55
const val RECOMMENDED_PERSONAL = 70
const val MEALS_BOX = 50
const val BOATS_DAMAGED = true
const val BOATS_NOT_DAMAGED = false
const val WEATHER_IS_GOOD = true

fun main() {

    println("Наличие повреждение корпуса: ")
    val hasDamage = readln().toBoolean()
    println("Текущий состав экипажа: ")
    val countPersonal = readln().toInt()
    println("Количество ящиков с провизией на борту: ")
    val countMealsBox = readln().toInt()
    println("Благоприятность метеусловий: ")
    val isWeatherGood = readln().toBoolean()

    val canSail = (hasDamage == BOATS_NOT_DAMAGED && countPersonal in MIN_PERSONAL..RECOMMENDED_PERSONAL &&
            countMealsBox > MEALS_BOX) || (hasDamage == BOATS_DAMAGED && countPersonal == RECOMMENDED_PERSONAL &&
            isWeatherGood == WEATHER_IS_GOOD && countMealsBox >= MEALS_BOX)

    println("Может ли корабль отправиться в долгосрочное плавание? $canSail")

}