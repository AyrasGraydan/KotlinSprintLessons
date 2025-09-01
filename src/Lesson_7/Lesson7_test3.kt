package Lesson_7

fun main() {

    print("Введите конченое число: ")
    val endNumber = readln().toInt()

    for (i in 0..endNumber) {
        if (i % 2 == 0) {
            println(i)
        }
    }

}