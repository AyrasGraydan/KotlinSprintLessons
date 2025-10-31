package Lesson_16

import kotlin.math.pow

fun main() {
    val circle = Circle(3.0)
    println("Радиус: ${circle.getRadius()}")
    println(String.format("Площадь: %.2f", circle.calculateArea()))
    println(String.format("Периметр: %.2f", circle.calculatePerimeter()))
}

private const val PI = 3.14

private class Circle(private val radius: Double) {

    fun getRadius() = radius
    fun calculateArea() = radius.pow(2.0) * PI
    fun calculatePerimeter() = 2 * radius * PI
}