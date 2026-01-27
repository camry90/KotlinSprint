package org.example.lesson_12

const val ONE_CELSIUS_IN_KELVIN = 273.15

class Weather2(
    kelvinDayTemperature: Int,
    kelvinNightTemperature: Int,
    kRainfall: Int,
) {

    var dayTemperature = (kelvinDayTemperature - ONE_CELSIUS_IN_KELVIN).toInt()
    var nightTemperature = (kelvinNightTemperature - ONE_CELSIUS_IN_KELVIN).toInt()
    var rainfall = kRainfall

    init {
        println(
            "Дневная температура: ${dayTemperature}\n" +
                    "Ночная температура: ${nightTemperature}\n" +
                    "Количество осадков: ${rainfall}"
        )
    }

}

fun main() {

    val sunday = Weather2(263, 295, 123)

}