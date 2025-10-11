package Lesson_11.test2

fun main() {

    val userMe = User2(
        id = 59123590,
        login = "ayras",
        password = "1111",
        mail = "ayras@gmail.com",
    )

    userMe.changeBio()
    println()
    userMe.changePassword()
    println()
    userMe.printUserInfo()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {
    fun printUserInfo() {
        println(id)
        println(login)
        println(password)
        println(mail)
        println(bio)
    }

    fun changeBio() {
        println("Напишите что-нибудь о себе: ")
        bio = readln()
    }

    fun changePassword() {
        println("Изменение пароля")
        print("Введите действующий пароля: ")
        if (readln() == password) {
            print("Введите новый пароль: ")
            password = readln()
            return
        }
        println("Неверный пароль")
    }
}