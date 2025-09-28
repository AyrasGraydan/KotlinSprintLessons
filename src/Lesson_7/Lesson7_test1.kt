package Lesson_7

fun main() {

    val lowercaseDiapason = 'a'..'z'
    val numberDiapason = 0..9

    val passwordLength = 6
    var password = ""

    for (i in 1..passwordLength) {

        if (password.length % 2 == 0) password += lowercaseDiapason.random()
        else password += numberDiapason.random()
    }
    println(password)
}

