package org.example.lesson_21

class Player212(
    val name: String,
    var currentHp: Int,
    val maxHp: Int,
)

fun Player212.isHealthy(): Boolean {
    return currentHp == maxHp
}

fun main() {

    val player212 = Player212("Alice", 10, 100)
    println(player212.isHealthy())
}