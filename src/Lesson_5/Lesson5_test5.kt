package Lesson_5

fun main() {

    val minNumber = 0
    val maxNumber = 42

    val randomNumberSet = mutableSetOf<Int>()

    while (randomNumberSet.size != 3) {
        randomNumberSet.add((minNumber..maxNumber).random())
    }

    val userNumbers = mutableSetOf<Int>()

    while (userNumbers.size != 3) {

        when (userNumbers.size) {

            0 -> for (i in 1..3) {
                print("Введите число №$i: ")
                userNumbers.add(readln().toInt())
            }

            1 -> for (i in 2..3) {
                print("Введите число №$i: ")
                userNumbers.add(readln().toInt())
            }

            2 -> {
                print("Введите число №3: ")
                userNumbers.add(readln().toInt())
            }
        }

        if (userNumbers.size != 3) println("Вы ввели одинаковые числа")
    }

    val guessedNumbers = userNumbers.intersect(randomNumberSet)

    when (guessedNumbers.size) {
        0 -> println("Вы ни одно числа не угадали")
        1 -> println("Вы угадали 1 число и получаете утешительный приз")
        2 -> println("Вы угадали 2 числа и получаете большой приз")
        3 -> println("Вы угадали все числа и выиграли джекпот")
    }

    println("Загаданные числа: $randomNumberSet")
}
