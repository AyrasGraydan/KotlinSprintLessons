package Lesson_7

fun main() {

    print("Введите количесто секунд: ")
    val seconds = readln().toInt()

    for (i in 1..seconds){
        Thread.sleep(1000)
        println(i)
    }

    println("Время вышло")
}