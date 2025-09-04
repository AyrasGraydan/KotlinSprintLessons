package Lesson_6

fun main() {

    print("Придумайте логин: ")
    val login = readln()

    print("Придумайте пароль: ")
    val password = readln()

    println()

    print("Введите логин: ")
    var authorizationLogin = readln()

    print("Введите логин: ")
    var authorizationPassword = readln()

    println()

    while (authorizationLogin != login || authorizationPassword != password) {
        println("Неверные данные")

        print("Введите логин: ")
        authorizationLogin = readln()

        print("Введите логин: ")
        authorizationPassword = readln()

        println()
    }

    println("Авторизация прошла успешно")

}