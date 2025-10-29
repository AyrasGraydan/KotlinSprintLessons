package Lesson_16

fun main() {
    val user = User("qqq", "111")

    printCheckPasswordResult((user.checkPassword("111")))
    printCheckPasswordResult((user.checkPassword("__xad")))
}

class User(val login: String, private val password: String) {

    fun checkPassword(value: String) = password == value
}

fun printCheckPasswordResult(value: Boolean) {
    if (value) println("Пароль верен")
    else println("Пароль не верен")
}