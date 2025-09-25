package Lesson_7

fun main() {

    val minLength = 6
    var password = ""

    print("Введите длинну пароля: ")
    val passwordLength = readln().toInt().coerceAtLeast(minLength)

    for (i in 1..passwordLength) {

        if ((0..2).random() == 0) password += (0..9).random()
        else password += (('a'..'z') + ('A'..'Z')).random()
    }

    println(password)
}