package org.example.lesson_3

fun main() {

    val moveInfoStr = "D2-D4;0"

    val parts = moveInfoStr.split("-", ";")
    val from = parts[0]
    val to = parts[1]
    val moveNumberPart = parts[2]

    println(from)
    println(to)
    println(moveNumberPart)

}