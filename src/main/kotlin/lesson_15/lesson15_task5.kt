package org.example.lesson_15

interface Movable {
    fun move()

}

interface PassengerTransport {
    fun loadPassenger()

    fun unloadPassenger()
}

interface CargoTransport {
    fun loadCargo()

    fun unloadCargo()
}

abstract class Vehicle(
    val color: String,
    val brand: String
)

class Automobile(color: String, brand: String) : Vehicle(color, brand), PassengerTransport, Movable {
    val maxCapacity = 3
    var currentCapacity = 0

    override fun loadPassenger() {
        if (currentCapacity < maxCapacity) {
            println("1 пассажир добавлен")
            currentCapacity++
        } else {
            println("Автомобиль полон")
        }
    }

    override fun unloadPassenger() {
        if (currentCapacity != 0) {
            println("1 пассажир вышел")
            currentCapacity--
        } else {
            println("Автомобиль пуст")
        }
    }

    override fun move() {
        println("Автомобиль едет")
    }
}

class Truck(color: String, brand: String) : Vehicle(color, brand), PassengerTransport, CargoTransport, Movable {
    val maxCapacity = 1
    val maxCargo = 2
    var currentCapacity = 0
    var currentCargo = 0

    override fun loadPassenger() {
        if (currentCapacity < maxCapacity) {
            println("1 пассажир добавлен")
            currentCapacity++
        } else {
            println("Грузовик полон пассажиров")
        }
    }

    override fun unloadPassenger() {
        if (currentCapacity != 0) {
            println("1 пассажир вышел")
            currentCapacity--
        } else {
            println("В грузовике пассажиров не осталось")
        }
    }

    override fun loadCargo() {
        if (currentCargo < maxCargo) {
            println("Груз весом в 1 тонну добавлен")
            currentCargo++
        } else {
            println("Грузовик полон")
        }
    }

    override fun unloadCargo() {
        if (currentCargo != 0) {
            println("Груз отброшен")
            currentCargo--
        } else {
            println("Грузовик без груза")
        }
    }

    override fun move() {
        println("Грузовик едет")
    }
}

fun main() {

    val car1 = Automobile("Black", "Audi")
    repeat(3) { car1.loadPassenger()}

    val car2 = Truck("White", "SITRAK")
    repeat(2) { car2.loadCargo()}
    car2.loadPassenger()

    val car3 = Automobile("Blue", "Golf")
    repeat(2) { car3.loadPassenger()}

    car1.move()
    car2.move()
    car3.move()

}

