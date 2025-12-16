package org.example.lesson_4

const val PEA_BENCHMARK_SUNNY = true
const val PEA_BENCHMARK_TENT = true
const val PEA_BENCHMARK_AIR_HUMIDITY = 20
const val SEASON_WINTER = "Winter"

fun main() {

    val isWeatherSunny = true
    val isTentOpen = true
    val airHumidity = 20
    val currentSeason = "Winter"

    val isGood = (isWeatherSunny == PEA_BENCHMARK_SUNNY) &&
            (isTentOpen == PEA_BENCHMARK_TENT) &&
            (airHumidity == PEA_BENCHMARK_AIR_HUMIDITY) &&
            (currentSeason != SEASON_WINTER)

    println("Благоприятные ли условия сейчас для роста бобовых? $isGood")

}