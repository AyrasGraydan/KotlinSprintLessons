package Lesson_6

import java.io.IO.readln

fun main() {

    var pauseTime = readln("Введите количество секунд: ").toInt()

    while (pauseTime > 0) {
        println("Осталось секунд: ${pauseTime--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}