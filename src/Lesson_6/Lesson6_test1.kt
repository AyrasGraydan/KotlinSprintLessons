package Lesson_6

fun main() {

    print("Придумайте логин: ")
    val login = readln()

    print("Придумайте пароль: ")
    val password = readln()

    println()

    do {
        print("Введите логин: ")
        val authorizationLogin = readln()

        print("Введите пароль: ")
        val authorizationPassword = readln()

        println()
        if (authorizationLogin == login && authorizationPassword == password) break

        println("Неверные данные")

    } while (authorizationLogin != login || authorizationPassword != password)

    println("Авторизация прошла успешно")

}