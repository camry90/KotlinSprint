package org.example.lesson_2

fun main() {
    val students = 4.0

    val mark1 = 3
    val mark2 = 4
    val mark3 = 3
    val mark4 = 5

    val averageMark = (mark1 + mark2 + mark3 + mark4) / students

    println("%.2f".format(averageMark))

}