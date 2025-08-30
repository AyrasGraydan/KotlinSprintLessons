package Lesson_6

import java.io.IO.readln

fun main() {

    var pauseTime = readln("Введите количество секунд: ").toInt()
    var timeElapsed = 0

    while (pauseTime > 0) {
        pauseTime--
        timeElapsed++
        Thread.sleep(1000)
    }

    when {
        timeElapsed == 1 -> println("Прошла $timeElapsed секунда")
        timeElapsed in 2..4 -> println("Прошло $timeElapsed секунды")
        timeElapsed > 4 -> println("Прошло $timeElapsed секунд")
    }
}