package org.example.lesson_12

const val DAYS_IN_MONTH = 30

class Weather3(
    _dayTemperature: Int,
    _nightTemperature: Int,
    _rainfall: Int,
) {
    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var rainfall = _rainfall

    init {
        println(
            "Дневаная температура: ${this.dayTemperature}\n" +
                    "Ночная температура: ${this.nightTemperature}\n" +
                    "Количество осадков: ${this.rainfall}"
        )
    }

}

fun main() {

    val randomTemperature = 0..20
    val randomRainfall = 0..52
    val weatherList = mutableListOf<Weather3>()


    for (i in 1..DAYS_IN_MONTH) {
        weatherList.add(Weather3(randomTemperature.random(), randomTemperature.random(), randomRainfall.random()))
    }

    val daytime = weatherList.map { it.dayTemperature }
    val nighttime = weatherList.map { it.nightTemperature }
    val countWithRainfalls = weatherList.count { it.rainfall > 0 }

    val daytimeAverage = daytime.average()
    val nighttimeAverage = nighttime.average()

    println(
        "Средняя дневаная температура за 30 дней: ${"%.2f".format(daytimeAverage)}\n" +
                "Средняя ночная температура за 30 дней: ${"%.2f".format(nighttimeAverage)}\n" +
                "Количество дней с осадками: $countWithRainfalls"
    )

}