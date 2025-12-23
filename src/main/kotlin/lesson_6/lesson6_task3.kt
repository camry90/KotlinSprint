package org.example.lesson_6

const val END_TIMER = 0

fun main() {

    println("На сколько секунд засечь?")
    var seconds = readln().toInt()

    while (seconds > END_TIMER) {
        println("Осталось ${seconds--}")
        Thread.sleep(1000)
    }

    println("Время вышло")

}