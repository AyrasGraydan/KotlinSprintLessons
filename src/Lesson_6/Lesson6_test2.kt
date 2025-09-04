package Lesson_6

fun main() {

    print("Введите количество секунд: ")
    var pauseTime = readln().toInt()
    var timeElapsed = 0

    while (pauseTime > 0) {
        pauseTime--
        timeElapsed++
        Thread.sleep(1000)
    }

    when {
        timeElapsed % 100 == 1 -> println("Прошла $timeElapsed секунда")
        timeElapsed % 100 in 2..4 -> println("Прошло $timeElapsed секунды")
        timeElapsed % 100 > 4 -> println("Прошло $timeElapsed секунд")
    }
}