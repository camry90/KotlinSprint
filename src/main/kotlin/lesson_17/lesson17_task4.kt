package org.example.lesson_17

class Package(
    private val packageNumber: Int,
    currentLocation: String,
) {
    private var counter: Int = 0
    var currentLocation: String = currentLocation
        set(value) {
            field = value
            counter++
            println("Счётчик: $counter")
        }
}

fun main() {

    val package1 = Package(124101, "China")
    package1.currentLocation = "New York"
    package1.currentLocation = "Moscow"
}