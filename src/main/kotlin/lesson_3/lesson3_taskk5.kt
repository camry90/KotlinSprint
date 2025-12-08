package org.example.lesson_3

fun main() {

    val moveInfoStr = "D2-D4;0"

    val parts = moveInfoStr.split(';')
    val movePart = parts[0]
    val moveNumberPart = parts[1]

    val fromToParts = movePart.split('-')
    val from = fromToParts[0]
    val to = fromToParts[1]

    println(from)
    println(to)
    println(moveNumberPart)

}