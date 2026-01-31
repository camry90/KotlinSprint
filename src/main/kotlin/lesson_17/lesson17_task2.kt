package org.example.lesson_17

class Boat(
    name: String,
    val avgSpeed: Int,
    val portName: String,
) {

    var name: String = name
        set(value) {
            if (field.isNotEmpty()) {
                println("Нельзя")
                return
            }
            field = value
        }

}

fun main() {

    val boat1 = Boat("Катер", 10, "Saint-deni")
    boat1.name = "Лодка"
}
