package Lesson_18

fun main() {
    val screen1 = Screen()
    val figures = listOf(
        screen1.drawCircle(1, 1), screen1.drawCircle(1.5f, 1.5f),
        screen1.drawSquare(1, 1), screen1.drawSquare(1.5f, 1.5f),
        screen1.drawPoint(1, 1), screen1.drawPoint(1.5f, 1.5f)
    )

    figures.forEach { println(it) }
}

class Screen {
    fun drawCircle(x: Int, y: Int) = "Нарисован круг - $x ; $y"
    fun drawCircle(x: Float, y: Float) = "Нарисован круг - $x ; $y"
    fun drawSquare(x: Int, y: Int) = "Нарисован квадрат - $x ; $y"
    fun drawSquare(x: Float, y: Float) = "Нарисован квадрат - $x ; $y"
    fun drawPoint(x: Int, y: Int) = "Нарисована точка - $x ; $y"
    fun drawPoint(x: Float, y: Float) = "Нарисована точка - $x ; $y"
}
