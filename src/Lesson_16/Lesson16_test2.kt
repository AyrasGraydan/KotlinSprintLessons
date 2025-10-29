package Lesson_16

fun main() {
    val circle = Circle(3f)
    println("Радиус: ${circle.getRadius()}")
    println(String.format("Периметр: %.2f", circle.calculateArea()))
    println(String.format("Периметр: %.2f", circle.calculatePerimeter()))
}

private class Circle(private val radius: Float) {
    private val pi = 3.14

    fun getRadius() = radius
    fun calculateArea() = radius * radius * pi
    fun calculatePerimeter() = 2 * radius * pi
}