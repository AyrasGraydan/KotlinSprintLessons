package Lesson_6

fun main() {

    print("Введите количество секунд: ")
    var pauseTime = readln().toInt()

    while (pauseTime > 0) {
        println("Осталось секунд: ${pauseTime--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}