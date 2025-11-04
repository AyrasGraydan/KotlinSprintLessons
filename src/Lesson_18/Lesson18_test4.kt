package Lesson_18

import kotlin.math.pow

fun main() {
    val box1 = SquareBox(2.0)
    val box2 = RectangularBox(2.0, 1.0, 3.0)
    val package1 = listOf<Box>(box1, box2)

    package1.forEach { println(it.getSquares()) }
}

open class Box() {
    open fun getSquares() = listOf(0.0)
}

class SquareBox(val length: Double) : Box() {
    override fun getSquares(): List<Double> {
        val square = length.pow(2.0)
        return List(3) { square }
    }
}

class RectangularBox(
    val length: Double,
    val width: Double,
    val height: Double
) : Box() {
    override fun getSquares() = listOf(length * width, length * height, width * height)
}