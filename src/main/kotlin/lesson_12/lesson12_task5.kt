package org.example.lesson_12

const val DAYS_IN_MONTH = 30

class Weather3(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val rainfall: Int,
) {

    fun printInfo() {
        println(
            "Дневная температура: $dayTemperature\n" +
                    "Ночная температура: $nightTemperature\n" +
                    "Количество осадков: $rainfall"
        )
    }

}

fun main() {

    val randomTemperature = 0..20
    val randomRainfall = 0..52
    val weatherList = List(DAYS_IN_MONTH) {
        Weather3(randomTemperature.random(), randomTemperature.random(), randomRainfall.random())
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