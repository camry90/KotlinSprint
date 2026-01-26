package org.example.lesson_14

open class CosmicBody(
    val name: String,
    val isHaveAtmosphere: Boolean,
    val isAbleLanding: Boolean
)

class Planet(
    name: String,
    isHaveAtmosphere: Boolean,
    isAbleLanding: Boolean,
    val satelliteList: List<Satellite>,

    ) : CosmicBody(name, isHaveAtmosphere, isAbleLanding)


class Satellite(
    name: String,
    isHaveAtmosphere: Boolean,
    isAbleLanding: Boolean
) : CosmicBody(name, isHaveAtmosphere, isAbleLanding)

fun main() {

    val mars = Planet(
        "Марс",
        true,
        false,
        listOf(
            Satellite("Фобос", false, true),
            Satellite("Деймос", false, true)
        )
    )

    println("Название планеты: ${mars.name}\nНазвания спутников: ")
    mars.satelliteList.forEach { println(it.name) }

}