package Lesson_5

import java.io.IO.readln

fun main() {

    val numberOne = 28
    val numberTwo = 42

    val possibleNumber1 = readln("Введите возможное число: ").toInt()
    val possibleNumber2 = readln("Введите возможное число: ").toInt()

    if ((possibleNumber1 == numberOne && possibleNumber2 == numberTwo) or (possibleNumber1 == numberTwo && possibleNumber2 == numberOne))
        println("Поздравляем! Вы выиграли главный приз!")
    else if (possibleNumber1 == numberOne || possibleNumber2 == numberTwo || possibleNumber1 == numberTwo || possibleNumber2 == numberOne)
        println("Вы выиграли утешительный приз!")
    else println("Неудача!")
}