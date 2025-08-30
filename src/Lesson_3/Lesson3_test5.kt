package Lesson_3

fun main() {

    val coordinate = "D2-D4;0"

    val split = coordinate.split("-", ";")

    val whereFrom = split[0]
    val whereTo = split[1]
    val strokeNumber = split[2]

    println(whereFrom)
    println(whereTo)
    println(strokeNumber)
}