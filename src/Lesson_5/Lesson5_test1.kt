package Lesson_5

import java.io.IO.readln

fun main() {

    val number1 = 5
    val number2 = 2

    val example = "$number1 + $number2 = "
    val answer = readln(example).toInt()


    if (answer == number1 + number2) println("Добро пожаловать")
    else println("Доступ запрещен")
}