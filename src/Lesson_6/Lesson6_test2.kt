package Lesson_6

const val MILLISECONDS_PER_MINUTE = 1000

fun main() {

    print("Введите количество секунд: ")
    var pauseTime = readln().toInt()

    Thread.sleep(pauseTime.toLong() * MILLISECONDS_PER_MINUTE)

    when {
        pauseTime % 100 == 1 -> println("Прошла $pauseTime секунда")
        pauseTime % 100 in 2..4 -> println("Прошло $pauseTime секунды")
        pauseTime % 100 > 4 -> println("Прошло $pauseTime секунд")
    }
}