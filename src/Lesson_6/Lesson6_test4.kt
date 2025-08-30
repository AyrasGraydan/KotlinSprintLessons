package Lesson_6

import java.io.IO.readln
import kotlin.random.Random

fun main() {
//    – если игрок угадывает число, выводится сообщение “Это была великолепная игра!” и программа завершает работу;
//    – если не угадывает, то отображается "Неверно" или что-то на твое усмотрение и оставшееся количество попыток;
//    – после истечения попыток выводится сообщение “Было загадано число N”.

    val minNumber = 1
    val maxNumber = 9

    var numberOfAttempts = 5

    val number = Random.nextInt(minNumber, maxNumber + 1)

    println("Попробуй угадать число от 1 до 9")
    var userNumber = readln("Введите ваш вариант: ").toInt()

    while (userNumber != number && numberOfAttempts > 0) {

        when (numberOfAttempts) {
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