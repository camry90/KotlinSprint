package org.example.lesson_21

fun main() {

    val hello = "ASDAJJq1ooooo"
    println(hello.vowelCount())

}

fun String.vowelCount(): Int {

    var counter = 0
    for (ch in this) {
        if (ch in "AOEIUaoeiu") {
            counter++
        }
    }
    return counter

}