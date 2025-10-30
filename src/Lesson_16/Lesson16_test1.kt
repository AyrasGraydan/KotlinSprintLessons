package Lesson_16

fun main() {
    val dice1 = Dice()
    val dice2 = Dice()
    dice1.printValue()
    dice2.printValue()
}

class Dice(private val value: Int = (1..6).random()) {

    fun printValue() {
        println("Число кубика: $value")
    }
}