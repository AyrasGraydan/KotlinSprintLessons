package Lesson_10

fun main() {
    val minLength = 4

    println("Минимальная длинна логина и пароля: 4 символа")
    print("Введите логин: ")
    val login = readln()
    print("Введите пароль: ")
    val password = readln()

    if (validateDate(login, password, minLength)) println("Добро пожадовать!")
    else println("Логин или пароль недостаточно длинные")
}

fun validateDate(login: String, password: String, minLength: Int): Boolean =
    (login.length >= minLength && password.length >= minLength)


