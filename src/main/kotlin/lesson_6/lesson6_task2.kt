package org.example.lesson_6

const val TIMER_END = 0

fun main() {

    println("На сколько секунд засечь?")
    var seconds = readln().toInt()

    while (seconds >= TIMER_END) {
        println("Прошло ${seconds--} ")
        Thread.sleep(1000)
    }

}