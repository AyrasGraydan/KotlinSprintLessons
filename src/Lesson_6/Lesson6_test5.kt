package Lesson_6

import java.io.IO.readln
import kotlin.random.Random

fun main() {

    val minNumber = 1
    val maxNumber = 9

    var number1 = 1
    var number2 = 1
    var userNumber = 0

    var numberOfAttempts = 3


    println("Отстои свою честь! Докажи, что ты не бот.")

    while (userNumber != number1 + number2 && numberOfAttempts > 0) {

        when (numberOfAttempts) {
            2 -> println("Целься метче, воин!")
            1 -> println("У тебя все шансы, сосредоточься...")
        }

        number1 = Random.nextInt(minNumber, maxNumber + 1)
        number2 = Random.nextInt(minNumber, maxNumber + 1)

        userNumber = readln("$number1 + $number2 = ").toInt()

        numberOfAttempts--
    }

    if (userNumber == number1 + number2){
        println("Я верил, что ты чист!")
        println("Двери тебе открыты..")
    } else println("Серое и безжизненное существо...")

}