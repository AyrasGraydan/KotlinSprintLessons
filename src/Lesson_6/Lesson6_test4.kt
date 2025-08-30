package Lesson_6

import java.io.IO.readln
import kotlin.random.Random

fun main() {

    val minNumber = 1
    val maxNumber = 9

    val number = Random.nextInt(minNumber, maxNumber + 1)

    var userNumber = 0
    var numberOfAttempts = 5

    println("Попробуй угадать число от 1 до 9")

    while (userNumber != number && numberOfAttempts > 0) {

        when (numberOfAttempts) {
            5 -> userNumber = readln("Введите ваш вариант: ").toInt()
            4 -> userNumber = readln("У тебя еще есть шансы: ").toInt()
            3 -> userNumber = readln("Ничего, бывает, попробуй еще раз: ").toInt()
            2 -> userNumber = readln("Я начинаю терять веру в тебя: ").toInt()
            1 -> userNumber = readln("Где ты свою удачу тратишь?: ").toInt()
        }

        numberOfAttempts--
    }

    println()

    if (userNumber == number) println("Это была великолепная игра!")
    else println("Ты был близок!")

}