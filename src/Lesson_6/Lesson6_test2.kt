package Lesson_6

const val MILLISECONDS_PER_SECOND = 1000

fun main() {

    print("Введите количество секунд: ")
    val pauseTime = readln().toLong()

    Thread.sleep(pauseTime * MILLISECONDS_PER_SECOND)

    when {
        (pauseTime % 100).toInt() == 1 -> println("Прошла $pauseTime секунда")
        pauseTime % 100 in 2..4 -> println("Прошло $pauseTime секунды")
        else -> println("Прошло $pauseTime секунд")
    }
}