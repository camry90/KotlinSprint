package org.example.lesson_14

open class Ship(
    val speed: Int = 20,
    val capacity: Int = 200,
)

class CargoShip(val payload: Int = 1400) : Ship(speed = 15)

class Icebreaker(val isIceBreak: Boolean = true) : Ship(speed = 15, capacity = 150)

class CruiseLiner : Ship(speed = 20, capacity = 600)

fun main() {

    val ship1 = CargoShip()
    val ship2 = Icebreaker()
    val ship3 = CruiseLiner()

}