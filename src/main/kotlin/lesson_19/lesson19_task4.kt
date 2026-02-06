package org.example.lesson_19

enum class Patron(val damage: Int) {

    BLUE(5),
    GREEN(10),
    RED(20),
    NOTHING(0);
}

class Tank() {
    var patron: Patron = Patron.NOTHING

    fun rearm(newPatron: Patron) {
        patron = newPatron
    }

    fun shoot() {
        println("Нанесено ${patron.damage}")
    }
}

fun main() {

    val tank1 = Tank()
    tank1.rearm(Patron.BLUE)
    tank1.shoot()
    tank1.rearm(Patron.GREEN)
    tank1.shoot()
    tank1.rearm(Patron.RED)
    tank1.shoot()
}