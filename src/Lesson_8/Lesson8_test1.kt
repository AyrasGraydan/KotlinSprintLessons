package Lesson_8

const val DAYS_PER_WEEK = 7

fun main() {

    val maxNumber = 100
    val viewsPerDays = IntArray(DAYS_PER_WEEK) { (Math.random() * (maxNumber + 1)).toInt() }

    val viewsPerWeek = viewsPerDays.sum()
    println(viewsPerWeek)

}