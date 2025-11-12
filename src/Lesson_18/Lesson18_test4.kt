package Lesson_18

import kotlin.math.pow

fun main() {
    val box1 = SquareBox(2.0)
    val box2 = RectangularBox(2.0, 1.0, 3.0)
    val package1 = listOf<Box>(box1, box2)

    package1.forEach { println(it.calculateSurfaceArea()) }
}

abstract class Box {
    abstract fun calculateSurfaceArea(): Double
}

class SquareBox(val length: Double) : Box() {
    override fun calculateSurfaceArea() = length.pow(2.0) * 6
}

class RectangularBox(
    val length: Double,
    val width: Double,
    val height: Double
) : Box() {
    override fun calculateSurfaceArea() =
        2 * (length * width + length * height + width * height)
}