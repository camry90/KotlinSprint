package org.example.lesson_6

const val SECONDS_TO_MILLIS = 1000L

fun main() {

    println("На сколько секунд засечь?")
    val seconds = readln().toInt()
    val millis = seconds * SECONDS_TO_MILLIS

    Thread.sleep(millis)

    println("Прошло $seconds секунд")

}