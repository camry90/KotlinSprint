package org.example.lesson_16

class Circle1(private val radius: Int) {
    private val pi = 3.14

    fun circleLength(): Int {
        return (radius * 2 * pi).toInt()
    }

    fun circleArea(): Int {
        return (radius * radius * pi).toInt()
    }
 }

fun main() {

    val circle1 = Circle1(4)
    val area = circle1.circleArea()
    val length = circle1.circleLength()
    println("Площадь круга: $area\nДлина окружности: $length")
}