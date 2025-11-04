package Lesson_18

fun main() {
    val screen1 = Screen()
    screen1.drawCircle(1, 1)
    screen1.drawCircle(1.5f, 1.5f)
    println()
    screen1.drawSquare(1, 1)
    screen1.drawSquare(1.5f, 1.5f)
    println()
    screen1.drawPoint(1, 1)
    screen1.drawPoint(1.5f, 1.5f)
}

class Screen() {

    fun drawCircle(x: Int, y: Int) {
        println("Нарисован круг - $x ; $y")
    }

    fun drawCircle(x: Float, y: Float) {
        println("Нарисован круг - $x ; $y")
    }

    fun drawSquare(x: Int, y: Int) {
        println("Нарисован квадрат - $x ; $y")
    }

    fun drawSquare(x: Float, y: Float) {
        println("Нарисован квадрат - $x ; $y")
    }

    fun drawPoint(x: Int, y: Int) {
        println("Нарисована точка - $x ; $y")
    }

    fun drawPoint(x: Float, y: Float) {
        println("Нарисована точка - $x ; $y")
    }
}
