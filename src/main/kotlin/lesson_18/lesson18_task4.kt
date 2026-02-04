package org.example.lesson_18

open class Box0 {

    open fun getSurfaceArea(): Int = 0

}

class RectangleBox(
    val length: Int,
    val width: Int,
    val height: Int,
) : Box0() {

    override fun getSurfaceArea(): Int {
        return 2 * (length * width + width * height + height * length)
    }
}

class CubeBox(
    val side: Int,
) : Box0() {

    override fun getSurfaceArea(): Int {
        return 6 * (side * side)
    }
}
