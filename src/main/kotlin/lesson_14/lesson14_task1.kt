package org.example.lesson_14

open class Ship(
    open val speed: Int = 20,
    open val capacity: Int = 200,
)

class CargoShip(val payload: Int = 1400) : Ship() {
    override val speed: Int = 15
}

class Icebreaker(val isIceBreak: Boolean = true) : Ship() {
    override val speed: Int = 10
    override val capacity: Int = 100
}

class CruiseLiner : Ship() {
    override val capacity: Int = 600
}

fun main() {

    val ship1 = CargoShip()
    val ship2 = Icebreaker()
    val ship3 = CruiseLiner()

}