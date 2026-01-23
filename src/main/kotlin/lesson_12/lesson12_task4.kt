package org.example.lesson_12

const val ONE_CELSIUS_IN_KELVIN = 273.15

class Weather2(
    _dayTemprature: Int,
    _nightTemprature: Int,
    _rainfall: Int,
) {

    var dayTemprature = (_dayTemprature - ONE_CELSIUS_IN_KELVIN).toInt()
    var nightTemprature = (_nightTemprature - ONE_CELSIUS_IN_KELVIN).toInt()
    var rainfall = _rainfall

    init {
        println(
            "Дневаная температура: ${this.dayTemprature}\n" +
                    "Ночная температура: ${this.nightTemprature}\n" +
                    "Количество осадков: ${this.rainfall}"
        )
    }

}

fun main() {

    val sunday = Weather2(263, 295, 123)

}
