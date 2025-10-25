package Lesson_14

const val pi = 3.14159F

fun main() {
    val rectangle1 = Rectangle("black", 2f, 3f)
    val rectangle2 = Rectangle("white", 3f, 5f)
    val circle1 = Circle("black", 3f)
    val circle2 = Circle("white", 5f)

    val figures = listOf(rectangle1, rectangle2, circle1, circle2)

    println(
        String.format(
            "Периметр черных: %.2f",
            figures.filter { it.color == "black" }.map { it.calculatePerimeter() }.sum()
        )
    )
    println(
        String.format(
            "Площадь белых: %.2f",
            figures.filter { it.color == "white" }.map { it.calculateArea() }.sum()
        )
    )
}

abstract class Figure(
    val color: String
) {
    abstract fun calculateArea(): Float
    abstract fun calculatePerimeter(): Float
}

class Circle(
    color: String, val radius: Float
) : Figure(color) {

    override fun calculateArea() = radius * radius * pi
    override fun calculatePerimeter() = 2 * radius * pi
}

class Rectangle(
    color: String, val height: Float, val weight: Float
) : Figure(color) {

    override fun calculateArea() = height * weight
    override fun calculatePerimeter() = (height + weight) * 2
}