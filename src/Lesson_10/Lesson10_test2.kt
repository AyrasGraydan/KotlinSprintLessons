package Lesson_10

const val minLength = 4

fun main() {
    println("Минимальная длинна логина и пароля: 4 символа")
    print("Введите логин: ")
    val login = readln()
    print("Введите пароль: ")
    val password = readln()

    if (validateLength(login) && validateLength(password)) println("Добро пожадовать!")
    else println("Логин или пароль недостаточно длинные")
}

fun validateLength(length: String): Boolean = length.length >= minLength