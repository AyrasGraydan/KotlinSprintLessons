package Lesson_1_10.Lesson_7

fun main() {

    print("Введите конченое число: ")
    val endNumber = readln().toInt()

    for (i in 0..endNumber step 2) println(i)
}