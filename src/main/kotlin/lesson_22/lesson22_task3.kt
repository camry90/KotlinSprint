package org.example.lesson_22

data class Person223(
    var name: String,
    var age: Int,
    var height: Int
)

fun main() {
    val (name, age, height) = Person223("Kamran", 20, 181)
    println("$name, $age, $height")
}
