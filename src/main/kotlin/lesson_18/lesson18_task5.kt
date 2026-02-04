package org.example.lesson_18

class Point185
class Circle185
class Square185

class Screen {

    fun draw(shape: Point185, x: Int, y: Int): String = draw(shape, x.toDouble(), y.toDouble())
    fun draw(shape: Point185, x: Float, y: Float): String = draw(shape, x.toDouble(), y.toDouble())
    fun draw(shape: Point185, x: Int, y: Float): String = draw(shape, x.toDouble(), y.toDouble())
    fun draw(shape: Point185, x: Float, y: Int): String = draw(shape, x.toDouble(), y.toDouble())

    fun draw(shape: Point185, x: Double, y: Double): String {
        return "Нарисована точка в координатах ($x, $y)"
    }

    fun draw(shape: Circle185, x: Int, y: Int): String = draw(shape, x.toDouble(), y.toDouble())
    fun draw(shape: Circle185, x: Float, y: Float): String = draw(shape, x.toDouble(), y.toDouble())
    fun draw(shape: Circle185, x: Int, y: Float): String = draw(shape, x.toDouble(), y.toDouble())
    fun draw(shape: Circle185, x: Float, y: Int): String = draw(shape, x.toDouble(), y.toDouble())

    fun draw(shape: Circle185, x: Double, y: Double): String {
        return "Нарисован круг в координатах ($x, $y)"
    }

    fun draw(shape: Square185, x: Int, y: Int): String = draw(shape, x.toDouble(), y.toDouble())
    fun draw(shape: Square185, x: Float, y: Float): String = draw(shape, x.toDouble(), y.toDouble())
    fun draw(shape: Square185, x: Int, y: Float): String = draw(shape, x.toDouble(), y.toDouble())
    fun draw(shape: Square185, x: Float, y: Int): String = draw(shape, x.toDouble(), y.toDouble())

    fun draw(shape: Square185, x: Double, y: Double): String {
        return "Нарисован квадрат в координатах ($x, $y)"
    }
}

fun main() {
    val screen = Screen()

    val point184 = Point185()
    val circle = Circle185()
    val square = Square185()

    println(screen.draw(point184, 10, 20))
    println(screen.draw(circle, 15.5f, 25.5f))
    println(screen.draw(square, 5, 10.5f))
    println(screen.draw(point184, 7.5f, 12))
    println(screen.draw(circle, 20.0, 30.0))
}
