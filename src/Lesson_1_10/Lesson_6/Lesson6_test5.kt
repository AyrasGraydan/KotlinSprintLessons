package Lesson_1_10.Lesson_6

fun main() {

    val minNumber = 1
    val maxNumber = 9

    var numberOfAttempts = 3

    println("Отстои свою честь! Докажи, что ты не бот.")

    do {
        when (numberOfAttempts) {
            2 -> println("Ты справишься, старайся!")
            1 -> println("У тебя еще все шансы, сосредоточься...")
        }

        val number1 = (minNumber..maxNumber).random()
        val number2 = (minNumber..maxNumber).random()

        print("$number1 + $number2 = ")
        val userNumber = readln().toInt()

        numberOfAttempts--

        if (userNumber == number1 + number2) {
            println("Я верил, что ты чист!")
            println("Двери тебе открыты..")
            return
        }

    } while (numberOfAttempts > 0)

    println("Серое и безжизненное существо...")
}