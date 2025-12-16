package org.example.lesson_4

const val MIN_WEIGHT_AVERAGE = 35
const val MAX_WEIGHT_AVERAGE = 100
const val MAX_VOLUME_AVERAGE = 100

fun main() {
    val firstCargoWeight = 20
    val firstCargoVolume = 80

    val secondCargoWeight = 50
    val secondCargoVolume = 100

    println("Груз с весом $firstCargoWeight кг и объёмом $firstCargoVolume л" +
            " соответствует категории 'Average': " +
            "${(firstCargoWeight > MIN_WEIGHT_AVERAGE) && (firstCargoWeight <= MAX_WEIGHT_AVERAGE) && (firstCargoVolume < MAX_VOLUME_AVERAGE)}")

    println("Груз с весом $secondCargoWeight кг и объёмом $secondCargoVolume л" +
            " соответствует категории 'Average': " +
            "${(secondCargoWeight > MIN_WEIGHT_AVERAGE) && (secondCargoWeight <= MAX_WEIGHT_AVERAGE) && (secondCargoVolume < MAX_VOLUME_AVERAGE)}")


}