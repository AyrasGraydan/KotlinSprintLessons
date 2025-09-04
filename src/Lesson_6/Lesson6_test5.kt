package Lesson_6

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
            2 -> println("Ты справишься, старайся!")
            1 -> println("У тебя еще все шансы, сосредоточься...")
        }

        number1 = (minNumber..maxNumber).random()
        number2 = (minNumber..maxNumber).random()

        print("$number1 + $number2 = ")
        userNumber = readln().toInt()

        numberOfAttempts--
    }

    if (userNumber == number1 + number2) {
        println("Я верил, что ты чист!")
        println("Двери тебе открыты..")
    } else println("Серое и безжизненное существо...")

}