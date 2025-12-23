package org.example.lesson_7

fun main() {

    println("Сколько секунд засечь: ")
    val seconds = readln().toInt()

    for (second in seconds downTo 1) {
        println("Осталость $second")
        Thread.sleep(1000)
    }

    println("Время вышло!")

}