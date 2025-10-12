package Lesson_1_10.Lesson_10

fun main() {
    print("Введите желаемую длину пароля: ")
    val passwordLength = readln().toIntOrNull() ?: 0
    println(generatePassword(passwordLength))
}

fun generatePassword(length: Int): String {
    val specialCharacters = ' '..'/'
    val numbers = 0..9
    var password = ""

    for (i in 1..length) {
        if (i % 2 == 0) password += specialCharacters.random()
        else password += numbers.random()
    }
    return password
}