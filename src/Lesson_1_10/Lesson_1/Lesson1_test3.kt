package Lesson_1_10.Lesson_1

const val  YEAR: Int = 1961

fun main() {

    var  hour: Int = 9
    var  minute: Int = 7

    println(YEAR)
    println(String.format("%02d:%02d", hour, minute))

    println()

    hour = 10
    minute = 55

    println(String.format("%02d:%02d", hour, minute))

}