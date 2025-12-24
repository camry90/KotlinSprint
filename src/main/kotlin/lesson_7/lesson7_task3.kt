package org.example.lesson_7

fun main() {

    println("Введите конечное число для вывода: ")
    val endRange = readln().toInt()

    for (i in 0..endRange step 2) {
        println("$i")
    }

}