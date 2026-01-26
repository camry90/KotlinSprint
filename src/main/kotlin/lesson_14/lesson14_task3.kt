package org.example.lesson_14

const val PI_NUMBER = 3.14

abstract class Figure(val color: String) {
    abstract fun perimeter(): Int

    abstract fun area(): Int
}

class Circle(val radius: Int, color: String) : Figure(color) {
    override fun perimeter(): Int {
        val p = 2 * radius * PI_NUMBER
        return p.toInt()
    }

    override fun area(): Int {
        val a = PI_NUMBER * (radius * radius)
        return a.toInt()
    }
}

class Rectangle(val a: Int, val b: Int, color: String) : Figure(color) {
    override fun perimeter(): Int {
        return 2 * (a + b)
    }

    override fun area(): Int {
        return a * b
    }
}

fun main() {

    val figureList = listOf(
        Circle(4, "Black"),
        Rectangle(4, 5, "White"),
        Circle(8, "White"),
        Rectangle(5, 8, "Black")
    )

    val blackFigures = figureList.filter { it.color == "Black" }
    val sumBlackFigure = blackFigures.sumOf { it.perimeter() }
    println("Сумма периметров всех черных фигур: $sumBlackFigure")

    val whiteFigures = figureList.filter { it.color == "White" }
    val sumWhiteFigure = whiteFigures.sumOf { it.area() }
    println("Сумма площадей всех белых фигур: $sumWhiteFigure")
}
