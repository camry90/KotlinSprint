package org.example.lesson_4


fun main() {

    println("Наличие повреждение корпуса: ")
    val hasDamage = readln().toBoolean()
    println("Текущий состав экипажа: ")
    val countPersonal = readln().toInt()
    println("Количество ящиков с провизией на борту: ")
    val countMealsBox = readln().toInt()
    println("Благоприятность метеусловий: ")
    val isWeatherGood = readln().toBoolean()

    val canSail = (!hasDamage && countPersonal in 55..70 &&
            countMealsBox > 50) || (hasDamage && countPersonal == 70 &&
            isWeatherGood &&  countMealsBox >= 50)

    println("Может ли корабль отправиться в долгосрочное плавание? $canSail")

}