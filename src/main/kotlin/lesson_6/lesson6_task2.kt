package org.example.lesson_6

fun main() {

    println("На сколько секунд засечь?")
    var seconds = readln().toInt()

    while (seconds >= 0) {
        println("Прошло ${seconds--} ")
        Thread.sleep(1000)
    }

}