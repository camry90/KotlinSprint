package org.example.lesson_14

open class Ship2(val speed: Int = 20, val capacity: Int = 200) {
    open fun loadMethod() {
        println("Происходит погрузка")
    }

    open fun printInfo() {
        println("Скорость судна: $speed\nВместимость судна: $capacity\n")
    }
}

class CargoShip2(val payload: Int = 1400) : Ship2(speed = 15) {
    override fun loadMethod() {
        println("Активируется погрузочный кран")
    }

    override fun printInfo() {
        println("Скорость грузового судна: $speed\nГрузоподьъёмность судна: $payload\n")
    }
}

class Icebreaker2(val isIceBreak: Boolean = true) : Ship2(speed = 15, capacity = 150) {
    override fun loadMethod() {
        println("Открываются ворота со стороны кормы")
    }

    override fun printInfo() {
        println("Скорость ледокола: $speed\nВместимость ледокола: $capacity\nМожет колоть лёд: $isIceBreak\n")
    }
}

class CruiseLiner2 : Ship2(speed = 20, capacity = 600) {
    override fun loadMethod() {
        println("Выдвигается горизонтальный трап со шкафута")
    }

    override fun printInfo() {
        println("Скорость лайнера: $speed\nВместимость лайнера: $capacity")
    }
}

fun main() {

    val ship1 = CargoShip2()
    ship1.loadMethod()
    ship1.printInfo()

    val ship2 = Icebreaker2()
    ship2.loadMethod()
    ship2.printInfo()

    val ship3 = CruiseLiner2()
    ship3.loadMethod()
    ship3.printInfo()

}