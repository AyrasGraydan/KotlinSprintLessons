package Lesson_4

import java.time.Year

const val AGE_OF_MAJORITY = 18

fun main() {

    val yearOfBirth = readln().toInt()

    val yearNow = Year.now().value

    if (yearNow - yearOfBirth >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Верунть на главный экран")

}