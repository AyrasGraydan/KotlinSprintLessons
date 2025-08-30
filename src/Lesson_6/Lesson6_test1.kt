package Lesson_6

import java.io.IO.readln

fun main() {

    val login = readln("Придумайте логин: ")
    val password = readln("Придумайте пароль: ")

    println()

    var authorizationLogin = readln("Введите логин: ")
    var authorizationPassword = readln("Введите логин: ")

    println()

    while (authorizationLogin != login || authorizationPassword != password) {
        println("Неверные данные")
        authorizationLogin = readln("Введите логин: ")
        authorizationPassword = readln("Введите логин: ")
        println()
    }

    println("Авторизация прошла успешно")

}