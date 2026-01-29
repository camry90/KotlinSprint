package org.example.lesson_15

abstract class WeatherStationStats(val weatherTime: String)

class Temperature(
    weatherTime: String,
    val temperature: Double,
) : WeatherStationStats(weatherTime)

class PrecipitationAmount(
    weatherTime: String,
    val amount: Int
) : WeatherStationStats(weatherTime)


class WeatherServer {

    fun sendMessage(data: WeatherStationStats) {
        when (data) {
            is Temperature -> println("В ${data.weatherTime} температура ${data.temperature} градусов")
            is PrecipitationAmount -> println("В ${data.weatherTime} выпало ${data.amount} мм осадков")
        }
    }
}

fun main() {

    val monday = WeatherServer()

    val mondayTemperature = Temperature("14:00", 12.5)
    val mondayPrecipitation = PrecipitationAmount("19:00", 21)

    monday.sendMessage(mondayTemperature)
    monday.sendMessage(mondayPrecipitation)
}
