package Lesson_3

fun main() {

    val coordinate = "D2-D4;0"


    val whereFrom = coordinate.split("-", ";")[0]
    val whereTo = coordinate.split("-", ";")[1]
    val strokeNumber = coordinate.split("-", ";")[2]

    println(whereFrom)
    println(whereTo)
    println(strokeNumber)
}