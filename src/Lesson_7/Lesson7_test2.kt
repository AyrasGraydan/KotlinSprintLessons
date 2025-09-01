package Lesson_7

import kotlin.random.Random

fun main() {

    val maxNumber = 9999
    val minNumber = 1000

    var code = 1
    var userCode = 0

    while (userCode != code) {

        code = Random.nextInt(minNumber, maxNumber)
        println("Ваш код авторизации: $code")

        print("Введите ваш код авторизации: ")
        userCode = readln().toInt()

    }

    println("Вы успешно авторизовались!")

}