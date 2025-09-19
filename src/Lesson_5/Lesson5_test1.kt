package Lesson_5

fun main() {

    val number1 = 5
    val number2 = 2

    val example = "$number1 + $number2 = "
    print(example)
    val answer = readln().toInt()


    if (answer == number1 + number2) println("Добро пожаловать")
    else println("Доступ запрещен")
}