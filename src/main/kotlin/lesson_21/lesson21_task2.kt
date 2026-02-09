package org.example.lesson_21

fun main() {

    val listInt: List<Int> = listOf(1, 5, 2, 6, 8, 3)
    println(listInt.evenNumberSum())
}

fun List<Int>.evenNumberSum(): Int {
    return this
            .filter { it % 2 == 0 }
            .sum()
}
