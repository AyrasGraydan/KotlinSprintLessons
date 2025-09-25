package Lesson_7

fun main() {

    val passwordLength = 6
    var password = ""

    for (i in 1..passwordLength) {

        if (password.length % 2 == 0) password += ('a'..'z').random()
        else password += (0..9).random()
    }
    println(password)
}

