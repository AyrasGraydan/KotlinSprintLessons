package Lesson_11.test2

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