package Lesson_5

fun main() {

    val numberOne = 28
    val numberTwo = 42

    print("Введите возможное число: ")
    val possibleNumber1 = readln().toInt()

    print("Введите возможное число: ")
    val possibleNumber2 = readln().toInt()

    when {
        (possibleNumber1 == numberOne && possibleNumber2 == numberTwo) ||
                (possibleNumber1 == numberTwo && possibleNumber2 == numberOne) ->
            println("Поздравляем! Вы выиграли главный приз!")

        possibleNumber1 == numberOne || possibleNumber2 == numberTwo ||
                possibleNumber1 == numberTwo || possibleNumber2 == numberOne -> println("Вы выиграли утешительный приз!")

        else -> println("Неудача!")
    }
}