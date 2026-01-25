package org.example.lesson_12

const val ONE_CELSIUS_IN_KELVIN = 273.15

class Weather2(
    kelvinDayTemperature: Int,
    kelvinNightTemperature: Int,
    kRainfall: Int,
) {

    val dayTemperature = (kelvinDayTemperature - ONE_CELSIUS_IN_KELVIN).toInt()
    val nightTemperature = (kelvinNightTemperature - ONE_CELSIUS_IN_KELVIN).toInt()
    val rainfall = kRainfall

    fun printInfo() {
        println(
            "Дневаная температура: ${dayTemperature}\n" +
                    "Ночная температура: ${nightTemperature}\n" +
                    "Количество осадков: ${rainfall}"
        )
    }

}

fun main() {

    val sunday = Weather2(263, 295, 123)
    sunday.printInfo()

}