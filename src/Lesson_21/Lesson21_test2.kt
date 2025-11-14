package Lesson_21

fun main() {
    val test1 = listOf(2, 2, 2, 4, 3, 3, 3)
    val test2 = mutableListOf(2, 2, 1)
    println(test1.evenNumbersSum())
    println(test2.evenNumbersSum())
}

fun List<Int>.evenNumbersSum() = this.filter { it % 2 == 0 }.sum()
