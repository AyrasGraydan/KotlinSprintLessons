package Lesson_4

const val TOTAL_TABLES = 13

fun main() {

    val bookedTablesToday = 13
    val bookedTablesTomorrow = 12

    val freeTablesToday = bookedTablesToday < TOTAL_TABLES
    val freeTablesTomorrow = bookedTablesTomorrow < TOTAL_TABLES


    println("Доступность столиков на сегодня: $freeTablesToday" + "\nДоступность столиков на завтра: $freeTablesTomorrow")

}

