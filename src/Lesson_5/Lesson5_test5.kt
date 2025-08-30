package Lesson_5

import kotlin.random.Random
import java.io.IO.readln

fun main() {

    val minNumber = 0
    val maxNumber = 42

    val randomNumberSet = mutableSetOf<Int>()
    repeat(3) { randomNumberSet.add(Random.nextInt(minNumber, maxNumber + 1)) }

    if (randomNumberSet.size != 3) {
        randomNumberSet.add(Random.nextInt(minNumber, maxNumber + 1))
    }

    val userNumbers = mutableSetOf<Int>(
        readln("Введите ваше число №1: ").toInt(),
        readln("Введите ваше число №2: ").toInt(),
        readln("Введите ваше число №3: ").toInt(),
    )

    checkingEnteredNumbers(userNumbers)

    val guessedNumbers = userNumbers.intersect(randomNumberSet)

    println()

    when (guessedNumbers.size) {
        0 -> println("Вы ни одно числа не угадали")
        1 -> println("Вы угадали 1 число и получаете утешительный приз")
        2 -> println("Вы угадали 2 числа и получаете большой приз")
        3 -> println("Вы угадали все числа и выиграли джекпот")
    }

    println("Загаданные числа: $randomNumberSet")


}

fun checkingEnteredNumbers(userNumbers: MutableSet<Int>) {

    if (userNumbers.size == 1) {
        println()
        println("Вы ввели 3 одинаковых числа")
        userNumbers.add(readln("Введите число №2: ").toInt())
        userNumbers.add(readln("Введите число №3: ").toInt())

        checkingEnteredNumbers(userNumbers)
    } else if (userNumbers.size == 2) {
        println()
        println("Вы ввели 2 одинаковых числа")
        userNumbers.add(readln("Введите число №3: ").toInt())

        checkingEnteredNumbers(userNumbers)
    }
}