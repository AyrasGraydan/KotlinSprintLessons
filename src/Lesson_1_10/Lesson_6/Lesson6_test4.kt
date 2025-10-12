package Lesson_1_10.Lesson_6

fun main() {

    val minNumber = 1
    val maxNumber = 9

    val number = (minNumber..maxNumber).random()

    var userNumber = 0
    var numberOfAttempts = 5

    println("Попробуй угадать число от 1 до 9")

    while (userNumber != number && numberOfAttempts > 0) {

        when (numberOfAttempts) {
            5 -> print("Введите ваш вариант: ")
            4 -> print("У тебя еще есть шансы: ")
            3 -> print("Ничего, бывает, попробуй еще раз: ")
            2 -> print("Я начинаю терять веру в тебя: ")
            1 -> print("Где ты свою удачу тратишь?: ")
        }
        userNumber = readln().toInt()
        numberOfAttempts--
    }

    println()

    if (userNumber == number) println("Это была великолепная игра!")
    else println("Ты был близок!")

    println("Загаданное число: $number")

}